package filaB.ejercicio4;

public class ContratoNetflix extends Builder {
    @Override
    public void buildCosto() {
        product.setCosto("200 Bs");
    }

    @Override
    public void buildEmpresa() {
        product.setEmpresa("Netflix");
    }

    @Override
    public void buildListaDeCanales() {
        product.setListaDeCanales("Netflix Movies, Netflix Series");
    }
}
