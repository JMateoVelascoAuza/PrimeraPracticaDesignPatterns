package Ejercicio7;

import java.util.Stack;

public class IteratorEmpresaArray implements Iterator{
    private int position;
    private String [] nombres ;

    public IteratorEmpresaArray(String [] nombres){
        this.nombres= nombres;
    }
    @Override
    public Object next() {
        return nombres[position++];
    }
    @Override
    public boolean hasNext() {
        return nombres.length != 0 && position < nombres.length;
    }
}
