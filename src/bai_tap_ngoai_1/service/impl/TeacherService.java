package bai_tap_ngoai_1.service.impl;

import bai_tap_ngoai_1.model.Teacher;
import bai_tap_ngoai_1.repository.ITeacherRepository;
import bai_tap_ngoai_1.repository.impl.TeacherRepository;
import bai_tap_ngoai_1.service.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private  static Scanner scanner=new Scanner(System.in);
    private ITeacherRepository iTeacherRepository = new TeacherRepository();
    @Override
    public void addTeacher() {
        Teacher teacher = this.inforTeacher();
        iTeacherRepository.addTeacher(teacher);
    }

    @Override
    public void Display() {
    List<Teacher> teacherList=iTeacherRepository.getAll();
    for (Teacher teacher:teacherList) {
        System.out.println(teacher);
    }
    }
    @Override
    public void Remove() {
        System.out.println("NHập mã số giao viên cần xóa");
        List<Teacher> teacherList=iTeacherRepository.getAll();
        int removeTeacher= Integer.parseInt(scanner.nextLine());
        for (int index=0; index<teacherList.size();index++) {
            if (removeTeacher==teacherList.get(index).getCode()) {
                teacherList.remove(index);
            }
        }
    }
    private Teacher inforTeacher() {
        System.out.println("Nhập mã số giáo viên: ");
        int code= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của giáo viên: ");
        String name= scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth= scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Chuyên môn: ");
        String specialize =scanner.nextLine();
        Teacher teacher= new Teacher(code, name, dateOfBirth, gender,specialize);
        return teacher;
}
}
