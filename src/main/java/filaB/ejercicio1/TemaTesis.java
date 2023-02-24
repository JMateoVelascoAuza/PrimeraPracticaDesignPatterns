package filaB.ejercicio1;

import java.util.*;

public class TemaTesis {
    private  Map<String, String> map = new HashMap<String,String>();
    private static TemaTesis instance;

    private TemaTesis(){
    }

    public static TemaTesis getInstance(){
        if (instance== null)
            instance= new TemaTesis();
        return instance;
    }

    public void registrar(Estudiante estudiante, String titulo){
        map.put(titulo, estudiante.getName());
        System.out.println("REGISTRANDO ESTUDIANTE Y TESIS");
        System.out.println("Nombre del estudiante: " + estudiante.getName());
        System.out.println("Título: " + titulo);
        System.out.println("Fecha y hora: " + new Date());
        System.out.println();
    }

    public void mostrarTesistas(JefeRRHH jefe){
        System.out.println(jefe.getName() + " quiere ver la lista de tesistas: ");
        for (String key : map.keySet()){
            System.out.println("- " + key + ": " + map.get(key));
        }
    }
}