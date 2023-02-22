package Ejercicio2;

public class Docentes implements IDocente {
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String horaDeEntrada;
    private String horaDeSalida;
    private String nombre;
    private String apellido;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Docentes clone() {
        Docentes clone = new Docentes();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMarcadoBiometrico(this.isMarcadoBiometrico());
        clone.setHoraDeEntrada(this.getHoraDeEntrada());
        clone.setHoraDeSalida(this.getHoraDeSalida());
        clone.setNombre(this.getNombre());
        clone.setApellido(this.getApellido());
        return clone;
    }

    public void showInfo(){
        System.out.println("*******Registro Docentes***********");
        System.out.println("NOMBRE: "+this.getNombre());
        System.out.println("APELLIDO: "+this.getApellido());
        System.out.println("SUELDO: "+this.getSueldo());
        System.out.println("CARGA HORARIA: "+this.getCargaHoraria());
        System.out.println("CURSO DE EDUCACION SUPERIOR: "+this.isCursoEducacionSuperior());
        System.out.println("ACCESO PLATAFORMA: "+this.isAccesoPlataforma());
        System.out.println("MARCADO BIOMETRICO: "+this.isMarcadoBiometrico());
        System.out.println("HORA DE ENTRADA: "+this.getHoraDeEntrada());
        System.out.println("HORA DE SALIDA: "+this.getHoraDeSalida());
    }

}
