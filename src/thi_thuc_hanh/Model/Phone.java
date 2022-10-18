package thi_thuc_hanh.Model;

import java.io.Serializable;
import java.util.Scanner;

public  class Phone implements Serializable {
    private int id;
    private String tensanpham;
    private double gia;
    private int soluong;
    private String nhasanxuat;

    public Phone(int id, String tensanpham, double gia, int soluong, String nhasanxuat) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.gia = gia;
        this.soluong = soluong;
        this.nhasanxuat = nhasanxuat;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }
    public void info(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao id: ");
        this.id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten dien thoai: ");
        this.tensanpham=scanner.nextLine();
        System.out.println("Nhap vao gia ban: ");
        this.gia=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so luong: ");
        this.soluong=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao nha san xuat: ");
        this.nhasanxuat=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", tensanpham='" + tensanpham + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", nhasanxuat='" + nhasanxuat + '\'' +
                '}';
    }
}
