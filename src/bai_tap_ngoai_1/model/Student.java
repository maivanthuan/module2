package bai_tap_ngoai_1.model;

public class Student extends person {
    private String className;
    private double point;

    public Student() {
    }

    public Student(int code, String name, String dateOfBirth, String gender, String className, double point) {
        super(code, name, dateOfBirth, gender);
        this.className = className;
        this.point = point;
    }

    @Override
    public String toString() {
        return "mã số:" +getCode()+" Tên:"+getName()+" Ngày sinh:"+getDateOfBirth()+" giới tính:"+getGender()+" lớp:"+getClassName()+" điểm:"+getPoint();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}

