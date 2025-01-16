//calculate the average of the grades and say if a student passed or failed
//and how much its left for the student to pass
package basics.section8.ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        double[] grades = new double[3];

        System.out.println("What is the student name? ");
        name = sc.nextLine();

        Student student = new Student(name, grades);
        student.setGrades();

        double average = student.average();
        if(average >= 6.0){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Missing " + (6-average) + " points");
        }
    }

}
