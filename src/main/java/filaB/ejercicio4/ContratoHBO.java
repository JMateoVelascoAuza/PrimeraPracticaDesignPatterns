package filaB.ejercicio4;

public class ContratoHBO extends Builder {
    @Override
    public void buildCosto() {
        product.setCosto("70 Bs");
    }

    @Override
    public void buildEmpresa() {
        product.setEmpresa("HBO");
    }

    @Override
    public void buildListaDeCanales() {
        product.setListaDeCanales("HBO Max, HBO Plus, HBO 2, HBO Family");
    }
}
