package Lesson_4;

public class Student extends User {

    public Student(String name, int score, int age) {
        super(name);
        this.score = score;
        this.age = age;
    }

    private int score;
    private int age;

    public int getAge(){
        return age;
    }

    public int getScore(){
        return score;
    }
    @Override
    public String toString() {
        return "Студент[" +
                "Имя студента: " + getName() +
                ", Успеваемость: " + score +
                ", Возраст: " + age +
                ']';
    }

}
