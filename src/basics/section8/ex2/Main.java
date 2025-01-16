// receives and reads staff data
// give the staff a raise later inputed
package basics.section8.ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double grossSalary;
        double tax;

        System.out.println("---Register Staff---");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Gross Salary: ");
        grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        tax = sc.nextDouble();

        Staff s1 = new Staff(name, grossSalary, tax);
        System.out.println(s1.toString());

        System.out.println("\n|---Giving a Raise---|");
        s1.increaseSalary(10);
        System.out.println(s1.toString());
    }
}