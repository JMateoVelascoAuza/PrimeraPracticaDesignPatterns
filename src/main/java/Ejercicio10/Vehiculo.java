package Ejercicio10;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private CentroDeControl peaje;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void showInfo(){
        System.out.println("***VEHICULO***");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+ placa);
    }
    public void cobrarPeaje(){
        CentroDeControl.getInstance(this).cobrar();
    }
}
