package Ejercicio5;

public class Lomito  extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("LOMITO -> Lomito");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("LOMITO -> Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("LOMITO -> Arroz");
    }

}
