package filaB.ejercicio4;

public class Usuario {
    private Builder builder;

    public Suscripcion getProductBuilder(){
        return builder.getProduct();
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
