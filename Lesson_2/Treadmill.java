package Lesson_2;
import java.util.Random;

public class Treadmill extends Obstacle{
    int distance;
    static Random r;
    
    static{Treadmill.r = new Random();}

    public Treadmill(int distance){
        super("Беговая дорожка");
        this.distance = distance;
    }

    public Treadmill(){
        this(r.nextInt(50, 1500));
    }
    public int getDistance(){
        return distance;
    }
}
