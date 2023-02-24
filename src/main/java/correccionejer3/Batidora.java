package correccionejer3;

public class Batidora implements IElectrodomestico {
    private int price;

    public Batidora(int price) {
        this.price = price;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("Creando Batidora");
        System.out.println("Precio: " + price);
        System.out.println();
    }
}
