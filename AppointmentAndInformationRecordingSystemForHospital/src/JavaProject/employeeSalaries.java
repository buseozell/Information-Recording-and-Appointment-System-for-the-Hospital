package JavaProject;

import JavaProject.employees;

public class employeeSalaries extends employees {

    private double weeklySalary;

    public employeeSalaries(String fullName1, String gender2, int age2, String employeesPosition, double weeklySalary) {
        super(fullName1, gender2, age2, employeesPosition);
        setWeeklySalary(weeklySalary);
    }

    public employeeSalaries() {
        super();
        this.weeklySalary=0.00;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0) {
            weeklySalary = 0;
        }
        this.weeklySalary =weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Weekly salary: " + getWeeklySalary());
    }






}





