package case_study.model;

import java.io.Serializable;

public abstract class Person implements Serializable {
 private  String id;
 private String name;
 private String DayOfBirth;
 private String Gender;
 private String CMND;
 private String PhoneNumber;
 private String Email;
 public Person() {
 }

    public Person(String id, String name, String dayOfBirth, String gender, String CMND, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        DayOfBirth = dayOfBirth;
        Gender = gender;
        this.CMND = CMND;
        PhoneNumber = phoneNumber;
        Email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return DayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        DayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DayOfBirth='" + DayOfBirth + '\'' +
                ", Gender='" + Gender + '\'' +
                ", CMND='" + CMND + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
