package Lesson_1;
import java.util.ArrayList;

public class Bucket{
    private ArrayList<Product> products;

    public Bucket(){
        this.products = new ArrayList<>();
    }

    /** 
     * @apiNote Возвращает список корзины
     */
    public ArrayList<Product> getProducts(){
        return products;
    }

    /**
     * @apiNote Метод добавления продуктов в корзину
     * @param product добавляемый товар.
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * @apiNote Удаление продукта из коллекции.
     * @param product удаляемый продукт.
     */
    public void removeProduct(Product product){
        products.remove(product);
    }
}
