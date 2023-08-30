package Lesson_1;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categorys;

    public Shop(){
        this.categorys = new ArrayList<>();
    }

    /**
     * @apiNote Метод добавляющий категорию.
     */
    public void addCategory(Category category){
        categorys.add(category);
    }

    /**
     * @apiNote Метод вывода магазина на консоль.
     */
    public void printShop(){
        int i = 0;
        for(Category category : categorys){
            System.out.println("----------" + "Категория №" + ++i + "----------" + "\n" + "----------" + category.getName().toUpperCase() +  "----------");
            ArrayList<Product> products = category.getProducts();
            for (Product product : products){
                product.getInfo();
            }
            System.out.println("\n");
        }
    }
}
