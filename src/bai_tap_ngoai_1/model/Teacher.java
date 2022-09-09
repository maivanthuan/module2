package bai_tap_ngoai_1.model;

public class Teacher extends person {
    private String specialize;
    public Teacher() {
    }

    public Teacher(int code, String name, String dateOfBirth, String gender, String specialize) {
        super(code, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "mã số:" +getCode()+" Tên:"+getName()+" Ngày sinh:"+getDateOfBirth()+" giới tính:"+getGender()+" chuyên môn: "+getSpecialize();
    }
    }

