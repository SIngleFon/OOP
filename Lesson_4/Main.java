package Lesson_4;

public class Main {
    public static void main(String[] args) {
        /**
         * UserService - наследники: Student and Teacher сервисы.
         * Позволяют создавать и сразу добавлять в ArrayList. 
         */
        StudentService studentService = new StudentService();
        studentService.createStudent("Петя", 50,10);
        System.out.println("Студенты\n" + studentService.getAll() + "\n");

        TeacherService teacherService = new TeacherService();
        teacherService.createTeacher("Вася", 50, "Math", 46);
        teacherService.createTeacher("Степан", 45, "Math", 41);
        System.out.println("Учителя\n"+teacherService.getAll() + "\n");


        /**
         * Comporator по возрастному параметру. Сортирует учителей.
         */
        teacherService.getAll().sort(new UserComparator<User>());
        System.out.println("Отсортированные по возрасту\n"+teacherService.getAll() + "\n");

        /**
         * Изменение конкретного учителя, путем указания его indexEdit и на значения, которые укажете в конструкторе.
         * Т.к. Это ООП, добавлять сканеры и выводы различных требований в консоль не стал.
         */
        teacherService.editTeacher(teacherService.getAll(), 0, "Goldy", "MAAAAATH", 8, 168);
        System.out.println("Изменение параметров:\n" +teacherService.getAll() + "\n");

        /** 
         * ТичерВью, показывает в консоли элементы листа через таб.
         */
        System.out.println("Вывод через foreach по линии");
        TeacherView teacherView = new TeacherView<>();
        teacherView.sendOnConsole(teacherService.getAll());
        StudentView studentView = new StudentView<>();
        studentView.sendOnConsole(studentService.getAll());
    }

}
