package Lesson_2;

import java.util.Random;

public class Robot extends Base{
    static Random r;
    static{
        Robot.r = new Random();
    }
    int lenght_run = 150;
    int height_jump = 0;

    public Robot(String name, int lenght_run, int height_jump) {
        super("Робот: " + name);
        this.lenght_run = lenght_run;
        this.height_jump = height_jump;
    }

    public Robot(String name){
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
        System.out.println(name + " не прыгает!" );
    }   
}
