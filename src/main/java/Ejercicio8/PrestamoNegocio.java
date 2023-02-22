package Ejercicio8;

public class PrestamoNegocio extends Prestamo {
    @Override
    public void operation(Cajero cajero,int canrtidad) {
        CuentaPrincipal.getUniqueInstance(10000).getPrestamo(canrtidad);
    }
}
