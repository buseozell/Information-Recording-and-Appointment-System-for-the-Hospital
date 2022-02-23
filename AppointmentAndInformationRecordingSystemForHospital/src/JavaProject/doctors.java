package JavaProject;

import JavaProject.userMembers;

public class doctors implements userMembers {

    private String firstName;
    private String lastName;
    private String gender1;
    private int age1;
    private String contactNumber;

    public doctors() {
        setFirstName("unknow");
        setLastName("unknow");
        setGender1("unknow");
        setAge1(0);
        setContactNumber("unknow");
    }

    public doctors(String firstName, String lastName, String gender1, int age1, String contactNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender1(gender1);
        setAge1(age1);
        setContactNumber(contactNumber);
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public void setGender1(String gender1) {
        this.gender1=gender1;
    }
    public void setAge1(int age1) {
        this.age1=age1;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber=contactNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender1() {
        return gender1;
    }
    public int getAge1() {
        return age1;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public void printInfo() {
        System.out.println("INFORMATION OF THE DOCTOR");
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Gender:  " + getGender1());
        System.out.println("Age: " + getAge1());
        System.out.println("Contact number:" + getContactNumber());
    }




}





