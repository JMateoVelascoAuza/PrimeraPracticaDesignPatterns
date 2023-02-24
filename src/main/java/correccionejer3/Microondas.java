package correccionejer3;

public class Microondas implements IElectrodomestico {
    private int price;

    public Microondas(int price) {
        this.price = price;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("Creando MICROONDAS");
        System.out.println("Precio: " + price);
        System.out.println();
    }
}
