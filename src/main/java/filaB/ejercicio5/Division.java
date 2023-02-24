package filaB.ejercicio5;

public class Division extends AbstractExpression {

    public Division(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.signo = "division";
        context.input = context.input.substring(this.digit);
    }
}
