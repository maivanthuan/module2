package thi_thuc_hanh.Controller;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("1.Điện thoại chính hãng");
            System.out.println("2.Điện thoại xách tay");
            System.out.println("3.Thoát ứng dụng");
            System.out.println("Mời chọn");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
