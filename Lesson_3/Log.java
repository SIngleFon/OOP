package Lesson_3;

public class Log {
    private static String log = "\nИнформация по действиям: \n";
    
    public String getLog(){
        return log;
    }

    public void addLog(String log){
        this.log = this.log + log;
    }
}
