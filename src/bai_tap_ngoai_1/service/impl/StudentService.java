package bai_tap_ngoai_1.service.impl;

import bai_tap_ngoai_1.model.Student;
import bai_tap_ngoai_1.repository.IStudentRepository;
import bai_tap_ngoai_1.repository.impl.StudentRepository;
import bai_tap_ngoai_1.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner=new Scanner(System.in);
   private IStudentRepository iStudentRepository=new StudentRepository();
    @Override
    public void addStudent() {
        Student student = this.inforStudent();
        iStudentRepository.addStudent(student);
    }

    @Override
    public void Display() {
        List<Student> studentList= iStudentRepository.getAll();
        for (Student student:studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void Remove() {
        System.out.println("NHập mã số sinh viên cần xóa");
        List<Student> studentList=iStudentRepository.getAll();
        int removeStudent= Integer.parseInt(scanner.nextLine());
        for (int index=0; index<studentList.size();index++) {
            if (removeStudent==studentList.get(index).getCode()) {
                studentList.remove(index);
            }
        }

    }

    private Student inforStudent() {
        System.out.println("Nhập mã số sinh viên: ");
        int code= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của sinh viên: ");
        String name= scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth= scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        String className=scanner.nextLine();
        System.out.println("Nhập điểm: ");
        double point= Integer.parseInt(scanner.nextLine());
        Student student=new Student(code, name, dateOfBirth, gender, className, point) ;
        return student;
    }
}
