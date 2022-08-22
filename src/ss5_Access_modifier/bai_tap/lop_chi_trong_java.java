package ss5_Access_modifier.bai_tap;

public class lop_chi_trong_java {
    private String name="Jonh";
    private String classes="co2";
     lop_chi_trong_java(){
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
       lop_chi_trong_java newstudent=new lop_chi_trong_java();
       String name="Mai Văn Thuận";
       String classes="PC1716";
       newstudent.setName(name);
       newstudent.setClasses(classes);
        System.out.println("Name: " +name+" Class: "+classes);
    }
}
