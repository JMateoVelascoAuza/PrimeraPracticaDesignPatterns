package correccionejer3;

public class Television implements IElectrodomestico {
    private int price;

    public Television(int price) {
        this.price = price;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("Creando TELEVISOR");
        System.out.println("Precio: " + price);
        System.out.println();
    }
}
