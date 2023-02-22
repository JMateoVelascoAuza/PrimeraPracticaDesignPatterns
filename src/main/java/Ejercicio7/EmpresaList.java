package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EmpresaList implements IList {
        List<String> nombres;

        public EmpresaList() {
            nombres = new ArrayList<>();
        }

        public void add(String value) {
            nombres.add(value);
        }

        @Override
        public IteratorEmpresaList iterator() {
            return new IteratorEmpresaList(this.nombres);
        }
}

