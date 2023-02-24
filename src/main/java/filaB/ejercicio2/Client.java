package filaB.ejercicio2;


public class Client {

    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setPeso(60);
        celular.setSize("10 inches");
        celular.setCamara(new Camara(10, "10 mp"));
        celular.setImei(10001);
        celular.setOrigen("Bolivia");

        System.out.println("Creando celular modelo");
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Peso: " + celular.getPeso());
        System.out.println("Tamaño: " + celular.getSize());
        System.out.println("Cémara con lente: " + celular.getCamara().getLente());
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("País de origen: " + celular.getOrigen());
        System.out.println();

        Celular c1 = (Celular) celular.clone();
        c1.setImei(10002);
        System.out.println("Creando segundo celular");
        System.out.println("IMEI: " + c1.getImei());
        System.out.println();

        Celular c2 = (Celular) celular.clone();
        c2.setImei(10003);
        System.out.println("Creando tercer celular");
        System.out.println("IMEI: " + c2.getImei());
        System.out.println();

        Celular c3 = (Celular) celular.clone();
        c3.setImei(10004);
        System.out.println("Creando cuarto celular");
        System.out.println("IMEI: " + c3.getImei());
        System.out.println();

        Celular c4 = (Celular) celular.clone();
        c4.setImei(10005);
        System.out.println("Creando quinto celular");
        System.out.println("IMEI: " + c4.getImei());
        System.out.println();
    }
}
