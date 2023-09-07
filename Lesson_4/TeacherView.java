package Lesson_4;

import java.util.List;
// import java.util.logging.Logger;

public class TeacherView<T extends Teacher> implements UserView<T> {

    @Override
    public void sendOnConsole(List<T> teachers) {
        for (T user : teachers) {
            System.out.println(user);
        }
    }

}
