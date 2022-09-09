package bai_tap_ngoai_1.controller;

import bai_tap_ngoai_1.service.IStudentService;
import bai_tap_ngoai_1.service.ITeacherService;
import bai_tap_ngoai_1.service.impl.StudentService;
import bai_tap_ngoai_1.service.impl.TeacherService;

import java.util.Scanner;

public class teacherController {
    private static ITeacherService iTeacherService = new TeacherService();
    private static Scanner scanner=new Scanner(System.in);
    public static void menuTeacher() {
        while (true) {
            System.out.println("1.Thêm mới giáo viên");
            System.out.println("2.Xóa giáo viên");
            System.out.println("3.Xem danh sách");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iTeacherService.addTeacher();
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    iTeacherService.Remove();
                    System.out.println("Xóa thành công");
                    iTeacherService.Display();
                    break;
                case 3:
                    iTeacherService.Display();
                    break;
                case 4:
                    return;
            }
        }
    }
}
