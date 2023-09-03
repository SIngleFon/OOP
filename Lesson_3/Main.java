package Lesson_3;

import java.util.Scanner;

public class Main {
    public static String checkCount(String print, int count) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        boolean flag = true;
        while (flag) {
            System.out.print(print);
            String check = scanner.nextLine();
            if (check.length() == count) {
                flag = false;
                return check;
            } else {
                System.out.println("Введите корректное значение");
            }

        }
        return "0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Log log = new Log();
        boolean replay = true;
        while (replay) {
            String usKey = "0";
            System.out.print("\033\143");
            log.addLog("\nСтатус: Инициализация\n");
            while (true) {
                usKey = checkCount("Выберите язык:" + "\n" + "1 - RU" + "\n" + "2 - EN" + "\n" + "3 - NUMBER" + "\n",
                        1);
                if (usKey.contains("1") | usKey.contains("2") | usKey.contains("3")) {
                    break;
                } else {
                    System.out.println("Ошибка. Выберите от 1 до 3: ");
                }
            }
            String x = checkCount("Укажите длину слова от 1 до 9: ", 1);
            log.addLog("Пользователь указал длину слова: " + x + "\n");
            String y = checkCount("Введите кол-во попыток от 1 до 9: ", 1);
            log.addLog("Пользователь указал кол-во попыток отгадать слово: " + x + "\n");
            Game game = new GameNumber();
            switch (usKey) {
                case "1": {
                    game = new RUGame();
                    log.addLog("Пользователь выбрал язык игры: RU\n");
                    break;
                }
                case "2": {
                    game = new ENGame();
                    log.addLog("Пользователь выбрал язык игры: EN\n");
                    break;
                }
                case "3":
                    game = new GameNumber();
                    log.addLog("Пользователь выбрал язык игры: Number\n");
                    break;
            }
            System.out.print("\033\143");
            game.start(Integer.parseInt(x), Integer.parseInt(y));

            int triy = 0;

            log.addLog("\nСтатус: Активная игра\n");
            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    && !game.getGameStatus().equals(GameStatus.LOSE)) {
                String scannerWord = checkCount("Введите слово: ", Integer.parseInt(x));
                Answer answer = game.inputValue(scannerWord);
                System.out.println(answer);
                log.addLog("Кол-во затраченных попыток: " + ++triy + "/" + Integer.parseInt(y) + "\n");

            }
            if (game.getGameStatus().equals(GameStatus.WINNER)) {
                log.addLog("\nСтатус: Победа!");
                System.out.println("Поздравляем, вы победили!");
            } else {
                System.out.println("Увы, вы проиграли.");
                log.addLog("\nСтатус: Проигрыш");
            }

            System.out.println("\n\nТребуются ли Вам логи игры?\n1 - Yes\n2 - No");
            int logs = scanner.nextInt();
            if (logs == 1) {
                System.out.print("\033\143");
                System.out.println(log.getLog());
            } 
            System.out.println("\n\nНачнем игру сначала?\n1 - Yes\n2 - No");
            int repl = scanner.nextInt();
            if(repl == 1){
                replay = true;
            } else{replay = false;
                System.out.println("Спасибо за игру!)");}

        }
    }
}
