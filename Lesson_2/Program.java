package Lesson_2;

public class Program {
    public static void main(String[] args) {
        System.out.print("\033\143");
        Base[] bases = {
                new Cat("Мурка"),
                new Cat("Мурыч"),
                new Human("Алёша"),
                new Robot("X7"),
                new Robot("B7-X1-X2"),
                new Cat("Atlet", 1000, 1000),
                new Human("Herkules", 10000, 10000)
        };

        Obstacle[] obstacles = {
                new Wall(150),
                new Treadmill(),
                new Wall(199),
                new Treadmill(100)
        };

        for (Base base : bases) {
            int count = 0;
            String name = base.getName();
            System.out.println("===============" + "\n" + "Начинает забег предентент " + name + "\n");
            int jump = 0;
            int run = 0;
            if (base instanceof Cat) {
                run = ((Cat) base).getLenght();
                jump = ((Cat) base).getHeight();
            }
            if (base instanceof Human) {
                run = ((Human) base).getLenght();
                jump = ((Human) base).getHeight();
            }
            if (base instanceof Robot) {
                run = ((Robot) base).getLenght();
                jump = ((Robot) base).getHeight();
            }
            for (Obstacle obstacle : obstacles) {

                if (obstacle instanceof Wall) {
                    int hei = ((Wall) obstacle).getHeight();
                    if (jump >= hei) {
                        System.out.println(name + " сумел перепрыгнуть препятствие: " + hei);
                        count++;
                    } else {
                        System.out
                                .println(name + " не сумел перепрыгнуть препятствие: " + hei + ". И вылетает из игры");
                        break;
                    }
                }
                if (obstacle instanceof Treadmill) {
                    int dist = ((Treadmill) obstacle).getDistance();
                    if (run >= dist) {
                        System.out.println(name + " сумел пробежать дистанцию: " + dist);
                        count++;
                    } else {
                        System.out
                                .println(name + " не сумел пробежать дистанцию " + dist + "\n" + "И вылетает из игры");
                        break;
                    }
                }
            }
            if (count == (obstacles.length)) {
                System.out.println("\n" + "---------------" + "\n" + name
                        + " Прошел все испытания на полосе препятствий!" + "\n" + "---------------" + "\n");
            } else {
                System.out.println(
                        "\n" + "---------------" + "\n" + name + " не сумел пройти" + "\n" + "---------------" + "\n");
            }
        }
    }
}
