package Ejercicio1;

public class Client {
    public static void main(String[] args) {

        Ventanilla ventanilla = new Ventanilla("TK141");

        Estudiante estudiante1 = new Estudiante("Mateo Michel", "637");
        ventanilla.setEstudiante(estudiante1);
        ventanilla.pagoMatricula();

        Estudiante estudiante2 = new Estudiante("Luciano Vargas", "365");
        ventanilla.setEstudiante(estudiante2);
        ventanilla.pagoMatricula();

        Estudiante estudiante3 = new Estudiante("Ander Cayllan", "920");
        ventanilla.setEstudiante(estudiante3);
        ventanilla.pagoMatricula();

        Estudiante estudiante4 = new Estudiante("Jose Carrasco", "493");
        ventanilla.setEstudiante(estudiante4);
        ventanilla.pagoMatricula();
        ventanilla.pagoMatricula();

        Estudiante estudiante5 = new Estudiante("Enrique Vicente", "153");
        ventanilla.setEstudiante(estudiante5);
        ventanilla.pagoMatricula();

        ventanilla.showInfo();

    }
}
