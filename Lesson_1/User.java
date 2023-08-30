package Lesson_1;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class User {
    protected static Random r;
    protected static int number;

    private String login;
    private String password;
    private Bucket bucket;
    static{
        User.r = new Random();
        User.number = 0;
    }
    /**
     * @apiNote Метод, отображающий логин и пароль пользователя.
     */
    public void getInfo(){
        System.out.println("Логин: "+login+". Пароль: "+password+". Корзина: ");
    }
    /**
     * 
     * @param user - пользователь, у кого надо посмотреть корзину.
     * @apiNote Метод, отображающий покупки пользователя.
     */
    public void getOrder(User user){
        ArrayList<Product> userProduct = user.getBucket().getProducts();
        System.out.println("----------"+"\n"+ "Login: "+user.getLogin()+"."+"\n"+"Корзина: ");
        for (Product product : userProduct){
            product.getInfo();
        System.out.println("----------"+"\n");
        }
    }

    /**
     * @apiNote Метод, для возвращения логина.
     * @return - возвращает String логин.
     */
    public String getLogin(){
        return login;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.bucket = new Bucket();
    }
    public User(String login){
        this(login, UUID.randomUUID().toString());
    }
    public User(){
        this(String.format("Default_User_%d", ++User.number));
    }
    public Bucket getBucket(){
        return bucket;
    }
}
