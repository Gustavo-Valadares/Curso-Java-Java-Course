package basics.section8.ex4;

public class Conversor {

    public static double amountInReais(double dollarPrice, double dollarQuant){
        double reais = dollarPrice*dollarQuant;
        return reais*(1.06);
    }
}
