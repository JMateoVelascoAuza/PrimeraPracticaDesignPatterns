package filaB.ejercicio3;

public class CreatorPelota extends Creator {
    @Override
    public PelotaFutbol factoryMethodProduct() {
        PelotaFutbol pelota = new PelotaFutbol();
        pelota.setSize("Mediana");
        pelota.setColor("Azul");
        pelota.setGarantia(false);
        return pelota;
    }
}
