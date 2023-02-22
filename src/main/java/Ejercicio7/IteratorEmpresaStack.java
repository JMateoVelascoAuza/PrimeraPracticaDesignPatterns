package Ejercicio7;

import java.util.Stack;

public class IteratorEmpresaStack implements Iterator{
    private Stack<String> nombres;
    private int position;

    public IteratorEmpresaStack(Stack<String> nombres) {
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
