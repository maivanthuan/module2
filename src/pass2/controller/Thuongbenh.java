package pass2.controller;

import pass2.service.IBenhNhanThuongService;
import pass2.service.IBenhNhanVipService;
import pass2.service.imlp.BenhNhanThuongService;
import pass2.service.imlp.BenhNhanVipService;

import java.util.Scanner;

public class Thuongbenh {
    public void ThuongMenu(){
        Scanner scanner = new Scanner(System.in);
        IBenhNhanThuongService iBenhNhanThuongService = new BenhNhanThuongService();
        do {
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem danh sach");
            System.out.println("4. Thoat");
            System.out.println("Tim kiem chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iBenhNhanThuongService.addBenhNhanThuong();
                    break;
                }
                case 2:{
//                    System.out.println("Nhap vao so thu tu benh an can xoa: ");
//                    int id=Integer.parseInt(scanner.nextLine());
//                    iBenhNhanThuongService.removeBenhNhanThuong(id);
                    break;
                }
                case 3:{
                    iBenhNhanThuongService.dispalyBenhNhanThuong();
                    break;
                }
                case 4:{
                    return;
                }
            }

        }while (true);
    }
}
