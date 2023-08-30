package Lesson_2;

public abstract class Base {
    String name;
    // int height_jump;
    // int lenght_run;

    public Base(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }
    public abstract void run(int distance);

    public abstract void jump(int height);

    }

