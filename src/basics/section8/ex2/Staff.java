package basics.section8.ex2;

public class Staff {
    private String name;
    private double grossSalary;
    private double tax;

    public Staff(){}

    public Staff(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNetSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage){
        this.setGrossSalary(this.getGrossSalary()+(this.getGrossSalary()*(percentage/100)));
    }

    public String toString(){
        return "Name " + this.getName() + "\nGross Salary: " + this.getGrossSalary() + "\nTax: " + this.getTax() + "\nNet Salary: " + this.getNetSalary();
    }

}
