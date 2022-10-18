package pass2.model;

import java.util.Objects;
import java.util.Scanner;

public abstract class benhvien {
    private String sothutu;
    private String mabenhan;
    private String tenbenhnhan;
    private String ngaynhapvien;
    private String ngayravien;
    private String lydonhapvien;
    public benhvien() {
    }

    public benhvien(String sothutu, String mabenhan, String tenbenhnhan, String ngaynhapvien, String ngayravien, String lydonhapvien) {
        this.sothutu = sothutu;
        this.mabenhan = mabenhan;
        this.tenbenhnhan = tenbenhnhan;
        this.ngaynhapvien = ngaynhapvien;
        this.ngayravien = ngayravien;
        this.lydonhapvien = lydonhapvien;
    }

    public String getSothutu() {
        return sothutu;
    }

    public void setSothutu(String sothutu) {
        this.sothutu = sothutu;
    }

    public String getMabenhan() {
        return mabenhan;
    }

    public void setMabenhan(String mabenhan) {
        this.mabenhan = mabenhan;
    }

    public String getTenbenhnhan() {
        return tenbenhnhan;
    }

    public void setTenbenhnhan(String tenbenhnhan) {
        this.tenbenhnhan = tenbenhnhan;
    }

    public String getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(String ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public String getNgayravien() {
        return ngayravien;
    }

    public void setNgayravien(String ngayravien) {
        this.ngayravien = ngayravien;
    }

    public String getLydonhapvien() {
        return lydonhapvien;
    }

    public void setLydonhapvien(String lydonhapvien) {
        this.lydonhapvien = lydonhapvien;
    }
    public void info(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số thứ tự bệnh án: ");
        this.sothutu=scanner.nextLine();
        System.out.println("Mã Bệnh án: ");
        this.mabenhan=scanner.nextLine();
        System.out.println("Tên bệnh nhân: ");
        this.tenbenhnhan=scanner.nextLine();
        System.out.println("Ngày nhập viện: ");
        this.ngaynhapvien=scanner.nextLine();
        System.out.println("Ngày ra viện ");
        this.ngayravien=scanner.nextLine();
        System.out.println("Lý do nhập viện");
        this.lydonhapvien=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "benhvien{" +
                "sothutu='" + sothutu + '\'' +
                ", mabenhan='" + mabenhan + '\'' +
                ", tenbenhnhan='" + tenbenhnhan + '\'' +
                ", ngaynhapvien='" + ngaynhapvien + '\'' +
                ", ngayravien='" + ngayravien + '\'' +
                ", lydonhapvien='" + lydonhapvien + '\'' +
                '}';
    }
    public abstract void benhvien();
}
