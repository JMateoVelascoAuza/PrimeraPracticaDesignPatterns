package Ejercicio3;

public class KitColegial implements IKit{
    private Computadora computadora = new Computadora();
    private Libro libro = new Libro();
    private Mochila mochila = new Mochila();

    public KitColegial(){}

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    @Override
    public void create() {
        System.out.println("Creando Kit Colegial...");
    }

    @Override
    public void showKit() {
        System.out.println("El Kit Colegial cuenta con:");
        computadora.showInfo();
        libro.showInfo();
        mochila.showInfo();
    }
}
