package filaB.ejercicio3;

public class CreatorCamiseta extends Creator {
    @Override
    public Camiseta factoryMethodProduct() {
        Camiseta camiseta = new Camiseta();
        camiseta.setSize("L");
        camiseta.setColor("Verde");
        return camiseta;
    }
}
