package Ejercicio7;

import java.util.List;
import java.util.Stack;

public class IteratorEmpresaList implements Iterator{
    private List<String> nombres;
    private int position;

    public IteratorEmpresaList(List<String> nombres) {
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
