package Ejercicio5;

public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Bife bife = new Bife();
        Lomito lomito = new Lomito();
        Tira tira = new Tira();

        chef.setTipoEspecialidad(bife);
        chef.buildEspecialidad();
        Especialidad especialidad1 = chef.getEspecialidad();
        especialidad1.showInfo();


        chef.setTipoEspecialidad(tira);
        chef.buildEspecialidad();
        Especialidad especialidad2 = chef.getEspecialidad();
        especialidad2.showInfo();


        chef.setTipoEspecialidad(lomito);
        chef.buildEspecialidad();
        Especialidad especialidad3 = chef.getEspecialidad();
        especialidad3.showInfo();


    }
}
