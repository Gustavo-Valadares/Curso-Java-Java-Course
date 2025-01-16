// receives height and width of a triangle and shows its perimeter, area and diagonal
package basics.section8.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float heigth;
        float width;
        float area;
        float perimeter;
        double diagonal;

        System.out.println("|---Calculate Rectangle---|");
        System.out.print("Height: ");
        heigth = sc.nextFloat();

        System.out.print("Width: ");
        width = sc.nextFloat();

        Rectangle rectangle = new Rectangle(heigth, width);

        area = rectangle.area(rectangle.getHeight(), rectangle.getWidth());
        perimeter = rectangle.perimeter(rectangle.getHeight(), rectangle.getWidth());
        diagonal = rectangle.diagonal(rectangle.getHeight(), rectangle.getWidth());

        System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nDiagonal: " + diagonal);
    }
}
