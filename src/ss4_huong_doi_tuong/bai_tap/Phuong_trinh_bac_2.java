package ss4_huong_doi_tuong.bai_tap;

import java.util.Scanner;

public class Phuong_trinh_bac_2 {
    private double a, b, c;

    public Phuong_trinh_bac_2 (double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return b*b-4*a*c;
    }
    public  double getRoot1() {
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public  double getRoot2() {
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        Phuong_trinh_bac_2 moi= new Phuong_trinh_bac_2(a, b, c);
        System.out.println("delta: "+moi.getDiscriminant());
        if (moi.getDiscriminant()<0) {
            System.out.println("Hàm vô nghiệp");
        }else {
            System.out.println("Nghiệm thứ nhất: "+moi.getRoot1()+"\n"+"Nghiệm thứ hai: "+moi.getRoot2());
        }

    }
}
