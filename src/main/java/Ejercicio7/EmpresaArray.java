package Ejercicio7;

public class EmpresaArray implements IList {
    private int position;
    private String [] nombres ;
    public EmpresaArray(){
        position=0;
        nombres= new String[4];
    }
    public void add(String value){
        nombres[position]=value;
        position++;
    }
    @Override
    public IteratorEmpresaArray iterator() {
        return  new IteratorEmpresaArray(nombres);
    }
}
