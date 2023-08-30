package Lesson_2;

import java.util.Random;

public class Human extends Base{
    static Random r;
    static{
        Human.r = new Random();
    }
    int lenght_run = 150;
    int height_jump = 50;


    public Human(String name, int lenght_run, int height_jump){
        super("Человек: " + name);
        this.lenght_run = lenght_run;
        this.height_jump = height_jump;
    }

    public Human(String name){
        this(name, r.nextInt(50, 1000), r.nextInt(100, 350));
    }

    public int getLenght(){
        return lenght_run;
    }
    public int getHeight(){
        return height_jump;
    }

    @Override
    public void run(int distance) {
        if(distance > lenght_run){
            System.out.println(name + " не пробежал:" +distance);
        } else{System.out.println(name + " пробежал: "+distance);}
    }

    @Override
    public void jump(int height) {
        if(height > height_jump){
            System.out.println(name + " не перепрыгнул "+height);
        } else{System.out.println(name + " перепрыгнул "+height);}
    }
    
}
