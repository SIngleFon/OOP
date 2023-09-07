package Lesson_4;
import java.util.ArrayList;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void createStudent(String name,int score,int age);
    void createTeacher(String name, int rate, String teachObj, int age);
    void editStudent(List<T> nameList, int indexEdit, String name, int score, int age);
    void editTeacher(List<T> nameList, int indexEdit, String name, String teachObj, int rate, int age);
}

