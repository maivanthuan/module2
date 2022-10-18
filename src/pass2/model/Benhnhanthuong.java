package pass2.model;

import java.util.Scanner;

public class Benhnhanthuong extends benhvien{
    private String phinamvien;

    public Benhnhanthuong() {;
    }
    public Benhnhanthuong(String sothutu, String mabenhan, String tenbenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien, String phinamvien) {
        super(sothutu, mabenhan, tenbenhnhan, ngaynhapvien, ngayravien, lydonhapvien);
        this.phinamvien = phinamvien;
    }

    public String getPhinamvien() {
        return phinamvien;
    }

    public void setPhinamvien(String phinamvien) {
        this.phinamvien = phinamvien;
    }
    public void infoBenhnhanthuong(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Phí nằm viện: ");
        this.phinamvien=scanner.nextLine();
    }
    @Override
    public String toString() {
        return "benhnhanthuong{" +
                "phinamvien='" + phinamvien + '\'' +
                '}';
    }

    @Override
    public void benhvien() {
    }
}
