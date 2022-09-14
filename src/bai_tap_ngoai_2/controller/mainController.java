package bai_tap_ngoai_2.controller;

import java.util.Scanner;

public class mainController {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ");
            System.out.println("Chọn chức năng");
            System.out.println("1.Thêm phương tiện mới");
            System.out.println("2.hiển thị phương tiện");
            System.out.println("3.Xóa phương tiện");
            System.out.println("4.Tìm kiếm theo biển kiểm soát");
            System.out.println("5.Thoát");
            System.out.println("Mời chọn: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddController.addMenu();
                    break;
                case 2:
                    DisplayController.displayController();
                    break;
                case 3:
                    RemoveController.removeMenu();
                    break;
                case 4:
                    SearchCarController.searchMenu();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
