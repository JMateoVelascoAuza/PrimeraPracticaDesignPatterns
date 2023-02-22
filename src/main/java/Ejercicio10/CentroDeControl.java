package Ejercicio10;

public class CentroDeControl {
    private Vehiculo vehiculo;
    private int dinero;
    private static CentroDeControl instance = null;

    private CentroDeControl(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        dinero = 0;
        System.out.println("+++++ PEAJE +++++");
    }

    public static CentroDeControl getInstance(Vehiculo vehiculo){
        if (instance == null)
            instance = new CentroDeControl(vehiculo);
        return instance;
    }

    public void cobrar(){
        vehiculo.showInfo();
        dinero = dinero + 5;
        System.out.println("Dinero recaudado por los peajes: Bs."+dinero);
    }






}
