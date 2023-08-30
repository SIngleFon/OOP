package Lesson_2;

import java.util.Random;

public class Wall extends Obstacle{
    private int height;
    static Random r;
    
    static{Wall.r = new Random();}

    public Wall(int height){
        super("Стена: ");
        this.height = height;
    }

    public Wall(){
        this(r.nextInt(10, 100));
    }

    public int getHeight(){
        return height;
    }
}
