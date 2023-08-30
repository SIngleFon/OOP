package Lesson_2;
import java.util.Random;

public class Cat extends Base{
    static Random r;
    static{
        Cat.r = new Random();
    }
    int lenght_run;
    int height_jump = 150;

    public Cat(String name, int lenght_run, int height_jump){
        super("Кот: " + name);
        this.lenght_run = lenght_run;
        this.height_jump = height_jump;
    }

    public Cat(String name){
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
