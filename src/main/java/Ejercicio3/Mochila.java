package Ejercicio3;

public class Mochila {
    private int nBolsillos;
    private String tamano;


    public int getnBolsillos() {
        return nBolsillos;
    }

    public void setnBolsillos(int nBolsillos) {
        this.nBolsillos = nBolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    public void showInfo(){
        System.out.println("---Mochila---");
        System.out.println("Numero De Bolsillos: "+nBolsillos);
        System.out.println("Tamano: "+ tamano);
    }
}
