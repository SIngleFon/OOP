package Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private List<Student> students;

    public StudentService(){
        students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void createStudent(String name, int score, int age) {
        Student student = new Student(name, score, age);
        students.add(student);
    }


    @Override
    public void createTeacher(String name, int rate, String teachObj, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createTeacher'");
    }

    @Override
    public void editStudent(List<Student> nameList, int indexEdit, String name, int score, int age) {
        nameList.set(indexEdit, new Student(name, score, age));
    }

    @Override
    public void editTeacher(List<Student> nameList, int indexEdit, String name, String teachObj, int rate, int age) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editTeacher'");
    }





    
}
