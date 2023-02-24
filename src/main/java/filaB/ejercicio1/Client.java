package filaB.ejercicio1;

public class Client {
    public static void main(String[]args) {
        TemaTesis s1 = TemaTesis.getInstance();
        s1.registrar(new Estudiante("Mario Velasco", "98765432"), "Sistemas");

        TemaTesis s2 = TemaTesis.getInstance();
        s2.registrar(new Estudiante("Mateo Auza", "34256785"), "Diseño");

        TemaTesis s3 = TemaTesis.getInstance();
        s3.registrar(new Estudiante("Sara Molina", "78645378"), "Turismo");

        TemaTesis s4 = TemaTesis.getInstance();
        s4.registrar(new Estudiante("Pedro Rivera", "89798675"), "Comercial");

        TemaTesis.getInstance().mostrarTesistas(new JefeRRHH("Alexis Marechal"));
    }
}