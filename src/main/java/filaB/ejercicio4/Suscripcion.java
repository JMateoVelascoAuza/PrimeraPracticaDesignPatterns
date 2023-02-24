package filaB.ejercicio4;

public class Suscripcion {
    private String costo;
    private String empresa;
    private String listaDeCanales;

    public Suscripcion(){
    }

    public String getCosto() {
        return costo;
    }

    public Suscripcion setCosto(String costo) {
        this.costo = costo;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Suscripcion setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getListaDeCanales() {
        return listaDeCanales;
    }

    public Suscripcion setListaDeCanales(String listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
        return this;
    }

    public void showInfo() {
        System.out.println("Creando subscripción: ");
        System.out.println("Costo: " + costo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Lista de canales: " + listaDeCanales);
        System.out.println();
    }
}
