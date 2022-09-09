package bai_tap_ngoai_1.controller;

import bai_tap_ngoai_1.service.IStudentService;
import bai_tap_ngoai_1.service.impl.StudentService;

import java.util.Scanner;

public class studentController {
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menuStudent() {
        while (true) {
            System.out.println("1.Thêm mới học sinh");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Xem danh sách");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    iStudentService.Remove();
                    System.out.println("Xóa thành công");
                    iStudentService.Display();
                    break;
                case 3:
                    iStudentService.Display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
