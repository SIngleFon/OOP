package Lesson_5.View;
import java.util.List;
import java.util.Scanner;

public class UserView implements View{
    public String log = "\033\143";
    Scanner in = new Scanner(System.in);
    @Override
    public int scanner() {
        return in.nextInt();
    }

    @Override
    public void appendLog(String log) {
        this.log += log + "\n";
    }


    @Override
    public void appendLog(List list) {
        this.log += list.get(list.size()-2).toString()+ " " + list.get(list.size()-1).toString();
    }
    
}
