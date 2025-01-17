//calculates the dollar conversion in reais (brazilian currency) plus the amount of taxes for the conversion (6%)
//using static class
package basics.section8.ex4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollarPrice = 0;
        double dollarQuant = 0;
        double amountToPay = 0;

        System.out.print("What is the doller price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought?");
        dollarQuant = sc.nextDouble();

        amountToPay = Conversor.amountInReais(dollarPrice, dollarQuant);

        System.out.println("Amount to pay: " + amountToPay);

    }
}
