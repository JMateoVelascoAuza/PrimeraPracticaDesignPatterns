package Ejercicio9;

import java.util.ArrayList;

public class NumberToRoman {

    // no terminal expresion
    private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;
    public NumberToRoman(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
            switch (token){
                case "1":
                    parseTree.add(new Roman1());
                    break;
                case "2":
                    parseTree.add(new Roman2());
                    break;
                case "3":
                    parseTree.add(new Roman3());
                    break;
                case "4":
                    parseTree.add(new Roman4());
                    break;
                case "5":
                    parseTree.add(new Roman5());
                    break;
                case "6":
                    parseTree.add(new Roman6());
                    break;
                case "7":
                    parseTree.add(new Roman7());
                    break;
                case "8":
                    parseTree.add(new Roman8());
                    break;
                case "9":
                    parseTree.add(new Roman9());
                    break;
                case "10":
                    parseTree.add(new Roman10());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluate() {
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
