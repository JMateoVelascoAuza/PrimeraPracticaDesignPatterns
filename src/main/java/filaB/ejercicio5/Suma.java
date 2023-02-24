package filaB.ejercicio5;

public class Suma extends AbstractExpression {

    public Suma (int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        context.signo = "suma";
        context.input = context.input.substring(this.digit);
    }
}
