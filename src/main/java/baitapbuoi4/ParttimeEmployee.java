package baitapbuoi4;

public class ParttimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    //Constructor

    public ParttimeEmployee(String name, int age, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, age, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    //Getter & Setter

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Override

    @Override
    public double calculateSalary() {
        return hourlyRate* hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loai: Nhan vien thoi vu");
        System.out.println("So gio lam: "+hoursWorked);
        System.out.println("Luong tinh theo gio: "+calculateSalary());
        //tinh theo gio la nhân với số giờ??

    }
}
