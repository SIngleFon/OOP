package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void createStudent(String name, int score, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

    @Override
    public void createTeacher(String name, int rate, String teachObj, int age) {
        Teacher teacher = new Teacher(name, rate, teachObj, age);
        teachers.add(teacher);
    }

    @Override
    public void editStudent(List<Teacher> nameList, int indexEdit, String name, int score, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editStudent'");
    }

    @Override
    public void editTeacher(List<Teacher> nameList, int indexEdit, String name, String teachObj, int rate, int age) {
        nameList.set(indexEdit, new Teacher(name, rate, teachObj, age));
    }




}