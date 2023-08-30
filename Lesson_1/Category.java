package Lesson_1;
import java.util.ArrayList;

public class Category{
    private String name;
    private ArrayList<Product> products;

    /**
     * @apiNote Метод, возвращающий имя категории.
     * @return Возвращает имя категории
     */
    public String getName(){
        return name;
    }
    public Category(String name){
        this.name = name;
        this.products = new ArrayList<>();
    }

    /**
     * Метод получения продуктов.
     * @return возвращает продукты.
     */
    public ArrayList<Product> getProducts(){
        return products;
    }

    /**
     * @apiNote Метод добавления продуктов в категорию
     * @param product товар, добавляемый в категорию.
     */
    public void addProduct(Product product){
        products.add(product);
    }
}
