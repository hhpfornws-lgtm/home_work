package baitapbuoi4;

public abstract class Employee extends Person {
    private int employeeId;

    //Constructor

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    //Getter & Setter

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    //Ghi de

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ma nhan vien: "+employeeId);
    }
}
