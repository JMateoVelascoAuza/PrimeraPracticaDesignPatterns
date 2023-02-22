package Ejercicio7;

import java.util.Stack;

public class EmpresaStack  implements IList {
    Stack<String> nombres;

    public EmpresaStack(){
        nombres= new Stack<>();
    }

    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorEmpresaStack iterator() {
        return new IteratorEmpresaStack(this.nombres);
    }
}
