package correccionejer3;

public class Radio implements IElectrodomestico {
    private int price;

    public Radio(int price) {
        this.price = price;
    }

    @Override
    public void crearElectrodomestico() {
        System.out.println("Creando RADIO");
        System.out.println("Precio: " + price);
        System.out.println();
    }
}
