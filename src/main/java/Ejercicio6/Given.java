package Ejercicio6;

public class Given extends EspanolIngles {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("como")) {
            context.output = context.output + "Given " ;
            context.input= context.input.substring(5); // Elimina caracter interpretado + space
        }
    }
}
