package Ejercicio5;

public class Tira  extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("TIRA -> Tira");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("TIRA -> Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("TIRA -> Fideo");
    }

}
