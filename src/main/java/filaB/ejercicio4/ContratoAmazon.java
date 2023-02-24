package filaB.ejercicio4;

public class ContratoAmazon extends Builder {
    @Override
    public void buildCosto() {
        product.setCosto("50 Bs");
    }

    @Override
    public void buildEmpresa() {
        product.setEmpresa("Amazon Prime");
    }

    @Override
    public void buildListaDeCanales() {
        product.setListaDeCanales("Amazon Prime Movies, Amazon Prime Series");
    }
}
