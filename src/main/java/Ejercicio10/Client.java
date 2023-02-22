package Ejercicio10;

public class Client {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("1234KJL", "Ford", "Bronco");
        v1.cobrarPeaje();
        Vehiculo v2 = new Vehiculo("3454JFK", "Toyota", "Tacoma");
        v1.cobrarPeaje();
        Vehiculo v3 = new Vehiculo("3775DJI", "JEEP", "Grand Cherokee");
        v1.cobrarPeaje();
        Vehiculo v4 = new Vehiculo("404KOL", "Volkswagen", "Golf");
        v1.cobrarPeaje();
        Vehiculo v5 = new Vehiculo("1506PAT", "BMW", "X5");
        v1.cobrarPeaje();
    }

}
