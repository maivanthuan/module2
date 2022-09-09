package bai_tap_ngoai_1.repository.impl;

import bai_tap_ngoai_1.model.Student;
import bai_tap_ngoai_1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void Remove() {

    }

    private List<Student> studentList=new ArrayList<>();

}
