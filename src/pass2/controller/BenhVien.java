package pass2.controller;

import java.util.Scanner;

public class BenhVien {
    public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
        BenhVien benhVien=new BenhVien();
        Vipbenh vipbenh=new Vipbenh();
        Thuongbenh thuongbenh=new Thuongbenh();
        System.out.println("--CHUONG TRINH QUAN LY BENH VIEN--");
        do {
            System.out.println("1.Benh nhan thuong.");
            System.out.println("2.Benh nhan vip.");
            System.out.println("3.Thoat");
            System.out.println("Nhap vao lua chon: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    thuongbenh.ThuongMenu();
                    break;
                }
                case 2: {
                    vipbenh.VipMenu();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }
        }while (true);
    }
    }
