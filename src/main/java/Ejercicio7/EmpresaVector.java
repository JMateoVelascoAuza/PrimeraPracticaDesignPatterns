package Ejercicio7;

import java.util.Vector;

public class EmpresaVector implements IList{
    Vector <String> nombres;

    public EmpresaVector(){
        nombres= new Vector<>();
    }

    public void add(String value){
        nombres.add(value);
    }


    @Override
    public IteratorEmpresaVector iterator() {
        return new IteratorEmpresaVector(this.nombres);
    }
}
