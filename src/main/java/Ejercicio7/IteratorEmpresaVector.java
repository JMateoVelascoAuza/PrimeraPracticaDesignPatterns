package Ejercicio7;

import java.util.Stack;
import java.util.Vector;

public class IteratorEmpresaVector implements Iterator{
    private Vector<String> nombres;
    private int position;

    public IteratorEmpresaVector(Vector<String> nombres) {
        this.nombres = nombres;
        this.position = 0;
    }

    @Override
    public Object next() {
        return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < nombres.size() && nombres.size() != 0;
    }
}
