package pass2.model;

import java.util.Scanner;

public class Benhnhanvip extends benhvien{
    private String loaivip;
    private String thoihanvip;

    public Benhnhanvip() {
    }

    public Benhnhanvip(String sothutu, String mabenhan, String tenbenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien, String loaivip, String thoihanvip) {
        super(sothutu, mabenhan, tenbenhnhan, ngaynhapvien, ngayravien, lydonhapvien);
        this.loaivip = loaivip;
        this.thoihanvip = thoihanvip;
    }

    public String getLoaivip() {
        return loaivip;
    }

    public void setLoaivip(String loaivip) {
        this.loaivip = loaivip;
    }

    public String getThoihanvip() {
        return thoihanvip;
    }

    public void setThoihanvip(String thoihanvip) {
        this.thoihanvip = thoihanvip;
    }
    public void infoBenhnhanvip(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao quoc gia xach tay: ");
        this.loaivip=scanner.nextLine();
        System.out.println("Nhap vao trang thai: ");
        this.thoihanvip=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "benhnhanvip{" +
                "loaivip='" + loaivip + '\'' +
                ", thoihanvip='" + thoihanvip + '\'' +
                '}';
    }

    @Override
    public void benhvien() {

    }
}
