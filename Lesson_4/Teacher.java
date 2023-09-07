package Lesson_4;

public class Teacher extends User {

    private int rate;
    private String teachObj;
    private int age;


    public Teacher(String name, int rate, String teachObj, int age) {
        super(name);
        this.rate = rate;
        this.teachObj = teachObj;
        this.age = age;
    }
    public int getRate(){
        return rate;
    }
    public String getTeachObj(){
        return teachObj;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return  "Учитель[" +
                "Имя учителя: " + getName() +
                ", Предмет: " + teachObj +
                ", Рейтинг: " + rate +
                ", Возраст: " + age +
                ']';
    }
}
