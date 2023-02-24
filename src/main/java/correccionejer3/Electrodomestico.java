package correccionejer3;

public class Electrodomestico {
    public static IElectrodomestico make(String typeProduct, int price){
        IElectrodomestico electrodomestico;
        switch (typeProduct.toLowerCase()){
            case "television":
                electrodomestico = new Television(price);
                break;
            case "radio":
                electrodomestico = new Radio(price);
                break;
            case "batidora":
                electrodomestico = new Batidora(price);
                break;
            case "refrigerador":
                electrodomestico = new Refrigerador(price);
                break;
            default:
                electrodomestico = new Microondas(price);
                break;
        }
        return electrodomestico;
    }
}
