package filaB.ejercicio5;

public class Client {
    public static void main(String[] args){
        String msg = "10 / 2 + 5 + 5 + 5";
        System.out.println("Mensaje recibido: " + msg);
        Interpreter parser = new Interpreter(msg);
        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());
        System.out.println();

        String msg2 = "9 / 3 + 1 + 2 + 3";
        System.out.println("Mensaje recibido: " + msg2);
        Interpreter parser2 = new Interpreter(msg2);
        System.out.println("Mensaje interpretado: " + parser2.evaluateMsg());
        System.out.println();
    }
}
