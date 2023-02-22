package Ejercicio5;

public class Bife extends BuilderEspecialidad {
    @Override
    public void buildTipoCarne() {
        this.especialidad.setTipoCarne("BIFE -> Bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.especialidad.setSaborRefresco("BIFE -> Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.especialidad.setGuarniciones("BIFE -> Papas Fritas");
    }


}
