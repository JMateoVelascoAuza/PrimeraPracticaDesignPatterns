package Ejercicio3;

public class Libro {
    private String tipo;
    private String autor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void showInfo(){
        System.out.println("---LIBRO---");
        System.out.println("Tipo: "+tipo);
        System.out.println("Autor: "+ autor);
    }
}
