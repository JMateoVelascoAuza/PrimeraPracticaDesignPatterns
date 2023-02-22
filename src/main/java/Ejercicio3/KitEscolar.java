package Ejercicio3;

public class KitEscolar implements IKit{
    private Mochila mochila = new Mochila();
    private Deportivo deportivo = new Deportivo();
    private Cuadernos cuadernos = new Cuadernos();

    public KitEscolar(){}

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void create() {
        System.out.println("Creando Kit Escolar...");
    }

    @Override
    public void showKit() {
        System.out.println("El Kit Escolar cuenta con:");
        deportivo.showInfo();
        cuadernos.showInfo();
        mochila.showInfo();
    }
}
