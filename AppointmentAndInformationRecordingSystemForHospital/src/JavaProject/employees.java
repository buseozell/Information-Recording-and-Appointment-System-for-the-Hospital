package JavaProject;

import JavaProject.userMembers;

public abstract class employees implements userMembers {

    private String fullName1;
    private String gender2;
    private int age2;
    private String employeesPosition;

    public employees() {
        setFullName1("unknow");
        setGender2("unknow");
        setAge2(0);
        setEmployeesPosition("unknow");
    }

    public employees(String fullName1, String gender2, int age2, String employeesPosition) {
        setFullName1(fullName1);
        setGender2(gender2);
        setAge2(age2);
        setEmployeesPosition(employeesPosition);
    }

    public void setFullName1(String fullName1) {
        this.fullName1=fullName1;
    }
    public void setGender2(String gender2) {
        this.gender2=gender2;
    }
    public void setAge2(int age2) {
        this.age2=age2;
    }
    public void setEmployeesPosition(String employeesPosition) {
        this.employeesPosition=employeesPosition;
    }
    public String getFullName1() {
        return fullName1;
    }
    public String getGender2() {
        return gender2;
    }
    public int getAge2() {
        return age2;
    }
    public String getEmployeesPosition() {
        return employeesPosition;
    }

    @Override
    public void printInfo() {
        System.out.println("INFORMATION OF THE EMPLOYEE");
        System.out.println("First name: " + getFullName1());
        System.out.println("Gender:  " + getGender2());
        System.out.println("Age: " + getAge2());
        System.out.println("Employee's position:" + getEmployeesPosition());
    }

    public abstract double earnings();


}





