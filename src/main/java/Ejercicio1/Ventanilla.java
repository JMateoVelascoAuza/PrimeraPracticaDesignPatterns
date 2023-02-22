package Ejercicio1;

public class Ventanilla {
    private Estudiante estudiante;
    private double matricula;
    private String codigoCajero;

    public String getCodigoCajero() {
        return codigoCajero;
    }

    public void setCodigoCajero(String codigoCajero) {
        this.codigoCajero = codigoCajero;
    }

    public Ventanilla(String codigoCajero){
        this.codigoCajero=codigoCajero;
        Cajero.getInstance().setCodigo(codigoCajero);
        Cajero.getInstance().showInfo();
        matricula=1000;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public void pagoMatricula(){
        if(!estudiante.pagoMatricula()){
            Cajero.getInstance().pagoACaja(matricula);
            System.out.println("SE ACABA DE REALIZAR EL PAGO DE LA MATRICULA A NOMBRE DE:" +estudiante.getNombre()+" CON CODIGO: "+estudiante.getCodigo());
            estudiante.setMatricula(true);
        } else{
            System.out.println("YA SE REALIZO EL PAGO DE LA MATRICULA A NOMBRE DE: "+estudiante.getNombre()+" CON CODIGO: "+estudiante.getCodigo());
        }

    }

    public void showInfo(){
        Cajero.getInstance().showInfo();
    }
}
