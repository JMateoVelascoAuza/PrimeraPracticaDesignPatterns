package Ejercicio3;

public class Cuadernos {
    private String tipo;
    private int nHojas;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnHojas() {
        return nHojas;
    }

    public void setnHojas(int nHojas) {
        this.nHojas = nHojas;
    }
    public void showInfo(){
        System.out.println("---CUADERNOS---");
        System.out.println("Tipo: "+tipo);
        System.out.println("Numero De Hojas: "+ nHojas);
    }
}
