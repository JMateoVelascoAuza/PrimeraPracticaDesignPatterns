package correccionejer3;

public class Client {
    public static void main(String[] args) {
        // Creado una televisión
        miElectrodomestico(Electrodomestico.make("television", 1000));

        // Creado una radio
        miElectrodomestico(Electrodomestico.make("radio", 250));

        // Creado una batidora
        miElectrodomestico(Electrodomestico.make("batidora", 510));

        // Creado un refrigerador
        miElectrodomestico(Electrodomestico.make("refrigerador", 1360));

        // Creado un microondas
        miElectrodomestico(Electrodomestico.make("microondas", 740));

    }

    public static void miElectrodomestico(IElectrodomestico electrodomestico){
        electrodomestico.crearElectrodomestico();
    }
}
