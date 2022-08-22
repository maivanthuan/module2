package ss4_huong_doi_tuong.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class lop_hinh_chu_nhat {
    double width, height;
    public lop_hinh_chu_nhat(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter() {
        return (this.width*this.height)*2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the width:");
        double width =scanner.nextDouble();
        System.out.println("Enter the height");
        double height =scanner.nextDouble();
        lop_hinh_chu_nhat rectangle = new lop_hinh_chu_nhat(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of rectangle: "+ rectangle.getArea());
    }
}
