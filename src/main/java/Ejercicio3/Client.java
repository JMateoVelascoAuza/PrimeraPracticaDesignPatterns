package Ejercicio3;

public class Client {
    public static void main(String[] args) {
        KitEscolar kE1 =  new KitEscolarCreator().create();
        KitEscolar kE2 =  new KitEscolarCreator().create();

        KitColegial kC1 =  new KitColegialCreator().create();
        KitColegial kC2 =  new KitColegialCreator().create();

        kE1.create();
        kE1.showKit();
        kE2.create();
        kE2.showKit();

        kC1.create();
        kC1.showKit();
        kC2.create();
        kC2.showKit();
    }
}
