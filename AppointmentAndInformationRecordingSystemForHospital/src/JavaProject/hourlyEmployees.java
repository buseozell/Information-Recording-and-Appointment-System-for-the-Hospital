package JavaProject;

import JavaProject.employees;

public class hourlyEmployees extends employees{

    private double wage;
    private double hours;

    public hourlyEmployees(String fullName1, String gender2, int age2, String employeesPosition, double wage, double hours) {
        super(fullName1, gender2, age2, employeesPosition);
        setWage(wage);
        setHours(hours);
    }

    private hourlyEmployees() {
        super();
        this.wage=0.00;
        this.hours=0.00;
    }

    public void setWage(double wage) {
        if(wage < 0) {
            wage = 0;
        }
        this.wage =wage;
    }
    public void setHours(double hours) {
        if(hours <0.00 || hours <=160.0) {
            System.out.println("valid");
        }
        this.hours=hours;
    }
    public double getWage() {
        return wage;
    }
    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 42) {
            return getWage()*getHours();
        }
        else {
            return 42*getWage() + (getHours() -40)*getWage()*1.5;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wage: " + getWage());
        System.out.println("Hours: " +getHours());
    }


}


