package filaB.ejercicio3;

public class CreatorShort extends Creator {
    @Override
    public Shorts factoryMethodProduct() {
        Shorts shorts = new Shorts();
        shorts.setSize("S");
        shorts.setColor("Blancos");
        return shorts;
    }
}
