package filaB.ejercicio5;

public class Numeros extends AbstractExpression {

    public Numeros(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.signo.equals("division")){
            context.output = context.output / Integer.parseInt(context.input.substring(0, this.digit));
            context.input = context.input.substring(this.digit);
        } else {
            context.output = context.output + Integer.parseInt(context.input.substring(0, this.digit));
            context.input = context.input.substring(this.digit);
        }
    }
}
