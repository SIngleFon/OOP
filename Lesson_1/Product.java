package Lesson_1;
import java.util.Random;

public class Product{
    protected static Random r;
    protected static int number;

    private String name;
    private int price;
    private int rate;
    
    static{
        Product.r = new Random();
        Product.number = 0;
    }
    /**
     * @apiNote Метод, отображающий товар.
     */
    public void getInfo() {
        System.out.println("Наименование товара: "+name+". Цена товара: "+price+". Рейтинг товара: "+rate + "/5");
    }

    public Product(String name, int price, int rate){
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Product(String name, int price){
       this(name, price, 0);
    }

    public Product(String name){
        this(name, Product.r.nextInt(100, 500), Product.r.nextInt(1,5));
    }
    public Product(){
        this(String.format("Unnamed_product_%d", ++Product.number));
    }
}
