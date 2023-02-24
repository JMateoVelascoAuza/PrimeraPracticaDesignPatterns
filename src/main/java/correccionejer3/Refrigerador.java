package correccionejer3;

public class Refrigerador implements IElectrodomestico {
    private int price;

    public Refrigerador(int price) {
        this.price = price;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("Creando REFRIGERADOR");
        System.out.println("Precio: " + price);
        System.out.println();
    }
}
