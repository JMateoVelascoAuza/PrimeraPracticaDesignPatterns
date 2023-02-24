package filaB.ejercicio2;

public class Celular implements ICelular {
    private String modelo;
    private String size;
    private int peso;
    private Camara camara;
    private int imei;
    private String origen;

    public Celular(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone(){
        Celular clone = new Celular();
        clone.setModelo(this.getModelo());
        clone.setSize(this.getSize());
        clone.setPeso(this.getPeso());
        clone.setCamara(this.getCamara());
        clone.setImei(this.getImei());
        clone.setOrigen(this.getOrigen());
        return clone;
    }
}
