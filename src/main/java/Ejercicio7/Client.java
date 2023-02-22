package Ejercicio7;

import java.util.HashMap;

public class Client {
    public static void main (String []args){
        int i =0;
        HashMap<String,String> finalList = new HashMap<>();

        EmpresaArray listaType1 = new EmpresaArray();
        listaType1.add("Mateo Michel");
        listaType1.add("Luciano Vargas");
        listaType1.add("Ander Cayllan");
        listaType1.add("Jose Carrasco");

        EmpresaVector listType2 = new EmpresaVector();
        listType2.add("Jon Seda");
        listType2.add("Rick Grimes");
        listType2.add("Dwayne Johnson");
        listType2.add("Terry Crews");

        EmpresaList listType3 = new EmpresaList();
        listType3.add("Levi Weston");
        listType3.add("Vin Diesel");
        listType3.add("Jason Momoa");
        listType3.add("John Cena");

        EmpresaStack listType4 = new EmpresaStack();
        listType4.add("Tyrese Gibson");
        listType4.add("Sung Kang");
        listType4.add("Daniela Melchior");
        listType4.add("Michael Rooker");

        Iterator iterator;
        iterator = listaType1.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }

        iterator = listType2.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }
        iterator = listType3.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }
        iterator = listType4.iterator();
        while ( iterator.hasNext()){
            String nombre = (String)iterator.next();
            finalList.put(nombre,nombre);
        }

        for (String key:finalList.keySet()
        ) {
            i++;
            System.out.println("Empleado "+i + ": " +finalList.get(key));
        }
    }
}
