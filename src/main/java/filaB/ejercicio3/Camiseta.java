package filaB.ejercicio3;

public class Camiseta implements IElementos {
    private String size;
    private String color;

    public Camiseta(){}

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

    @Override
    public void create() {
        System.out.println("Creando camiseta deportiva");
        System.out.println("Tamaño: " + size);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
