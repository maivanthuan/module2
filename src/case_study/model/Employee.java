package case_study.model;

import java.io.Serializable;
import java.util.logging.Level;

public class Employee  extends Person{
        private String level;
        private String location;
        private String wage;
        public Employee(){
        }

    public Employee(String id, String name, String dayOfBirth, String gender, String CMND, String phoneNumber, String email, String level, String location, String wage) {
        super(id, name, dayOfBirth, gender, CMND, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "levels='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
