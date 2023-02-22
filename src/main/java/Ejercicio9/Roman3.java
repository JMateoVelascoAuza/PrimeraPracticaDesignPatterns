package Ejercicio9;

public class Roman3 extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")) {
            context.output = context.output + "III ";
            context.input= context.input.substring(1); // Elimina caracter interpretado
        }
    }

}
