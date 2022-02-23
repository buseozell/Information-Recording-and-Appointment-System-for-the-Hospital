package JavaProject;

import java.io.Serializable;

import JavaProject.userMembers;

public class Patients  implements Serializable, userMembers{

    public static final long serialVersionUID =-3745752517293934724L;

    private int patientID;
    private String fullName2;
    private int age3;
    private String disturbance;
    private int phoneNumber;
    private String email;
    private int numberOfPatients=0;

    public Patients() {
        setPatientID(0);
        setFullName2("unknow");
        setAge3(0);
        setDisturbance("unknow");
        setPhoneNumber(0);
        setEmail("unknow");

    }

    public Patients(int patientID, String fullName2, int age3, String disturbance, int phoneNumber, String email) {
        setPatientID(patientID);
        setFullName2(fullName2);
        setAge3(age3);
        setDisturbance(disturbance);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        numberOfPatients++;

    }

    public void setPatientID(int patientID) {
        this.patientID=patientID;
    }
    public void setFullName2(String fullName2) {
        this.fullName2=fullName2;
    }
    public void setAge3(int age3) {
        this.age3=age3;
    }
    public void setDisturbance(String disturbance) {
        this.disturbance=disturbance;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public int getPatientID() {
        return patientID;
    }
    public String getFullName2() {
        return fullName2;
    }
    public int getAge3() {
        return age3;
    }
    public String getDisturbance() {
        return disturbance;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    @Override
    public void printInfo() {
        System.out.println("INFORMATION OF THE PATIENT");
        System.out.println("The patient ID: " +patientID);
        System.out.println("Full name: " +fullName2);
        System.out.println("Age: " +age3);
        System.out.println("The patient's disturbance: " +disturbance);
        System.out.println("The patient's contact information ");
        System.out.println("Phone number: " +phoneNumber);
        System.out.println("E-mail address: " +email);
    }


}


