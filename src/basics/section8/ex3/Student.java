package basics.section8.ex3;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades() {
        int i = 0;

        System.out.println("Type the 3 grades: ");

        for(i = 0; i < 3; i++){
            this.grades[i] = sc.nextDouble();
        }

    }

    public double arithmeticMean(){
        double am = 0;
        for(double grade : grades){
            am += grade;
        }

        return am/grades.length;
    }

    @Override
    public String toString() {
        return "Student{" + ", name: '" + name + '\'' + ", grades:" + Arrays.toString(grades) + '}';
    }
}
