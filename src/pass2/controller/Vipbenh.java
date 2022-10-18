package pass2.controller;

import pass2.service.IBenhNhanVipService;
import pass2.service.imlp.BenhNhanVipService;

import java.util.Scanner;

public class Vipbenh {
    public void VipMenu(){
        Scanner scanner = new Scanner(System.in);
        IBenhNhanVipService iBenhNhanVipService = new BenhNhanVipService();
        do {
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem danh sach");
            System.out.println("4. Thoat");
            System.out.println("Tim kiem chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iBenhNhanVipService.addBenhNhanVip();
                    break;
                }
                case 2:{
//                    System.out.println("Nhap vao so thu tu benh an can xoa: ");
//                    int id=Integer.parseInt(scanner.nextLine());
//                    iBenhNhanVipService.removeBenhNhanVip(id);
                    break;
                }
                case 3:{
                    iBenhNhanVipService.dispalyBenhNhanVip();
                    break;
                }
                case 4:{
                    return;
                }
            }

        }while (true);
    }
}

