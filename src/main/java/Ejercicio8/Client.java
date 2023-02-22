package Ejercicio8;

public class Client {
    public static void main (String [] args){

        Cajero mateo = new Cajero("mateo");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(mateo,50);
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                FactoryPrestamo.make(FactoryPrestamo.PrestamoType.FINANCIAMIENTO).operation(mateo,50);
            }
        });

        thread.start();
        thread1.start();

        FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(mateo,50);

        FactoryPrestamo.make(FactoryPrestamo.PrestamoType.CREDITO).operation(mateo,15000);

    }
}
