package Lesson_1;

// Муминов
// 4720 группа

public class Program {
    public static void main(String[] args) {
        System.out.print("\033\143");

        //Создание магазина
        Shop shop = new Shop();

        //Создание категории
        Category category = new Category("Шоколад");
        //Добавление в категории товаров.
        category.addProduct(new Product("Алёнка", 99, 4));
        category.addProduct(new Product("Милка", 150 ));
        category.addProduct(new Product("Бабаевский"));
        category.addProduct(new Product());

        //Импорт категории в магазин
        shop.addCategory(category);
        //Отображение ассортимента магазина
        shop.printShop();

        //Создание пользователя
        User user = new User("Zola1");
        //Добавление товара в корзину пользователя
        user.getBucket().addProduct(category.getProducts().get(1));

        //Удаление продукта из категории(магазина)
        category.getProducts().remove(1);

        //Получение покупок пользователя
        user.getOrder(user);

        //Отображение ассортимента магазина
        shop.printShop();
    }
    
}
