// receives height and width of a rectangle and shows its perimeter, area and diagonal
package basics.section8.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heigth;
        double width;
        double area;
        double perimeter;
        double diagonal;

        System.out.println("|---Calculate Rectangle---|");
        System.out.print("Height: ");
        heigth = sc.nextDouble();

        System.out.print("Width: ");
        width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(heigth, width);

        area = rectangle.area(rectangle.getHeight(), rectangle.getWidth());
        perimeter = rectangle.perimeter(rectangle.getHeight(), rectangle.getWidth());
        diagonal = rectangle.diagonal(rectangle.getHeight(), rectangle.getWidth());

        System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nDiagonal: " + diagonal);
    }
}
