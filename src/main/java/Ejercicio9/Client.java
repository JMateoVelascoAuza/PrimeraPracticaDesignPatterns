package Ejercicio9;

public class Client {
    public static void main (String [] args){
        String numeros="1 2 3 4 5 6 7 8 9 10";
        System.out.println("Numeros Arabigos: "+numeros);
        System.out.println("Numeros Romanos: "+ new NumberToRoman(numeros).evaluate());
    }
}
