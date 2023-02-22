package Ejercicio2;

import javax.print.Doc;

public class Client {
    public static void main(String[] args) {
        Docentes docentes = new Docentes();
        docentes.setNombre("");
        docentes.setApellido("");
        docentes.setSueldo(5000);
        docentes.setCargaHoraria(80);
        docentes.setCursoEducacionSuperior(true);
        docentes.setAccesoPlataforma(true);
        docentes.setMarcadoBiometrico(false);
        docentes.setHoraDeEntrada("08:00");
        docentes.setHoraDeSalida("18:00");

        Docentes d1 = docentes.clone();
        d1.setNombre("Marian");
        d1.setApellido("Quispe");
        d1.showInfo();

        Docentes d2 = docentes.clone();
        d2.setNombre("Fred");
        d2.setApellido("Stalin");
        d2.showInfo();

        Docentes d3 = docentes.clone();
        d3.setNombre("Mateo");
        d3.setApellido("Auza");
        d3.showInfo();

        Docentes d4 = docentes.clone();
        d4.setNombre("Alexis");
        d4.setApellido("Mouint");
        d4.showInfo();

        Docentes d5 = docentes.clone();
        d5.setNombre("Kenny");
        d5.setApellido("Harrison");
        d5.showInfo();

        Docentes d6 = docentes.clone();
        d6.setNombre("Julia");
        d6.setApellido("Samanta");
        d6.showInfo();

        Docentes d7 = docentes.clone();
        d7.setNombre("Marco");
        d7.setApellido("Simon");
        d7.showInfo();

        Docentes d8 = docentes.clone();
        d8.setNombre("Mario");
        d8.setApellido("Pizarro");
        d8.showInfo();

        Docentes d9 = docentes.clone();
        d9.setNombre("Mariano");
        d9.setApellido("Perez");
        d9.showInfo();

        Docentes d10 = docentes.clone();
        d10.setNombre("Luis");
        d10.setApellido("Mamani");
        d10.showInfo();

        Docentes d11 = docentes.clone();
        d11.setNombre("Fran");
        d11.setApellido("Bohorquez");
        d11.showInfo();

        Docentes d12 = docentes.clone();
        d12.setNombre("Maria");
        d12.setApellido("Pele");
        d12.showInfo();

        Docentes d13 = docentes.clone();
        d13.setNombre("James");
        d13.setApellido("Jhonson");
        d13.showInfo();

        Docentes d14 = docentes.clone();
        d14.setNombre("Vladimir");
        d14.setApellido("Marko");
        d14.showInfo();

        Docentes d15 = docentes.clone();
        d15.setNombre("Mauricio");
        d15.setApellido("Rojas");
        d15.showInfo();
    }
}
