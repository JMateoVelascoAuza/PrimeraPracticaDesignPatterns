package filaB.ejercicio4;

public class Client {
    public static void main(String[] args){
        Usuario usuario = new Usuario();
        ContratoAmazon ca = new ContratoAmazon();
        ContratoHBO ch = new ContratoHBO();
        ContratoNetflix cn = new ContratoNetflix();

        usuario.setBuilder(ca);
        usuario.buildProduct();
        Suscripcion s1 = usuario.getProductBuilder();
        s1.showInfo();

        usuario.setBuilder(ch);
        usuario.buildProduct();
        Suscripcion s2 = usuario.getProductBuilder();
        s2.showInfo();

        usuario.setBuilder(cn);
        usuario.buildProduct();
        Suscripcion s3 = usuario.getProductBuilder();
        s3.showInfo();
    }
}
