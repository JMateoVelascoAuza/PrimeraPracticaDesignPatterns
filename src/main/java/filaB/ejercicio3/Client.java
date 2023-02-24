package filaB.ejercicio3;

public class Client {
    public static void main(String[] args){
        PelotaFutbol pelota = new CreatorPelota().factoryMethodProduct();
        pelota.create();

        Camiseta camiseta = new CreatorCamiseta().factoryMethodProduct();
        camiseta.create();

        Shorts shorts = new CreatorShort().factoryMethodProduct();
        shorts.create();

        Medias medias = new CreatorMedias().factoryMethodProduct();
        medias.create();

        Tenis tenis = new CreatorTenis().factoryMethodProduct();
        tenis.create();
    }
}
