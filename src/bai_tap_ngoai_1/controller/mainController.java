package bai_tap_ngoai_1.controller;

import java.util.Scanner;

public class mainController {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Chào mừng bạn đến với ứng dụng của tui");
            System.out.println("Chọn chức năng theo số");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giáo viên");
            System.out.println("3. Thoát ứng dụng");
            System.out.println("Mời chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
