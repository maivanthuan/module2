package bai_tap_ngoai_1.repository.impl;

import bai_tap_ngoai_1.model.Teacher;
import bai_tap_ngoai_1.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {

    @Override
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void Display() {
    }

    @Override
    public List<Teacher > getAll() {
        return teacherList;
    }

    @Override
    public void Remove() {

    }
    List<Teacher> teacherList= new ArrayList<>();

}
