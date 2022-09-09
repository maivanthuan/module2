package bai_tap_ngoai_1.repository;

import bai_tap_ngoai_1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    void addTeacher(Teacher teacher);
    void Display();
    List<Teacher> getAll();
    void Remove();
}
