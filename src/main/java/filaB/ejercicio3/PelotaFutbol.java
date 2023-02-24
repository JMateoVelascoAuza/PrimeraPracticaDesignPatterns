package filaB.ejercicio3;

public class PelotaFutbol implements IElementos {
    private String size;
    private String color;
    private Boolean garantia;

    public PelotaFutbol(){}

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getGarantia() {
        return garantia;
    }

    public void setGarantia(Boolean garantia) {
        this.garantia = garantia;
    }

    @Override
    public void create() {
        System.out.println("Creando pelota de futbol");
        System.out.println("Tamaño: " + size);
        System.out.println("Color: " + color);
        System.out.println("Garantía: " + garantia);
        System.out.println();
    }
}
