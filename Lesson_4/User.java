package Lesson_4;

public class User {
    private String name;


    public int getAge(){
        if(this instanceof Student) {
            return getAge();
        }else if(this instanceof Teacher){
            return getAge();
        } 
        else {
            return 0;
        }
    }

    public String getName(){
        return name;
    }

    public User(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
