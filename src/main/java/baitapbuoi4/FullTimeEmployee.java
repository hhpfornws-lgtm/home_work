package baitapbuoi4;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    //Constructor

    public FullTimeEmployee(String name, int age, int employeeId, double monthlySalary) {
        super(name, age, employeeId);
        this.monthlySalary = monthlySalary;
    }

    //Getter & Setter

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    //Override

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loai: Nhan vien chinh thuc");
        System.out.println("Luong hang thang: ");
    }
}
