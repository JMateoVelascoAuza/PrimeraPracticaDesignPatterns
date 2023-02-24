package filaB.ejercicio3;

public class CreatorTenis extends Creator {
    @Override
    public Tenis factoryMethodProduct() {
        Tenis tenis = new Tenis();
        tenis.setSize("36-38");
        tenis.setColor("Negros");
        return tenis;
    }
}
