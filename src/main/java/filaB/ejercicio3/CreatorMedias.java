package filaB.ejercicio3;

public class CreatorMedias extends Creator {
    @Override
    public Medias factoryMethodProduct() {
        Medias medias = new Medias();
        medias.setSize("42-44");
        medias.setColor("Negras");
        return medias;
    }
}
