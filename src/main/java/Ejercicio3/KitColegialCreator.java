package Ejercicio3;

public class KitColegialCreator extends CreatorKit{
    @Override
    public KitColegial create() {
        KitColegial kit = new KitColegial();
        Computadora pc = new Computadora();
        pc.setMarca("NVIDIA");
        pc.setOs("Windows 11");
        kit.setComputadora(pc);

        Libro libro = new Libro();
        libro.setAutor("Baldor");
        libro.setTipo("Matematicas");
        kit.setLibro(libro);

        Mochila mochila = new Mochila();
        mochila.setnBolsillos(6);
        mochila.setTamano("L");
        kit.setMochila(mochila);

        return kit;
    }
}
