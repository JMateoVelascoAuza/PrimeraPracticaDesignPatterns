package filaB.ejercicio4;

public abstract class Builder {
    protected Suscripcion product;

    public Suscripcion getProduct() {
        return product;
    }

    public void createProduct() {
        this.product = new Suscripcion();
    }

    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaDeCanales();
}
