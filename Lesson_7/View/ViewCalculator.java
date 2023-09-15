package Lesson_7.View;

import Lesson_7.Controller.ComplexCalculator;
import Lesson_7.Data.ComplexNumber;

import java.util.Arrays;
import java.util.Scanner;

public class ViewCalculator {
    ComplexCalculator calculator = new ComplexCalculator();

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void run() {
        while (true) {
            // Метод работающий, но а зачем?)
            // String text = prompt("Введите пример(хх хх х хх хх): ");
            // String[] priv = text.split("\s+");
            // System.out.println(Arrays.toString(priv));
            // ComplexNumber complexNumber1 = new ComplexNumber(Integer.parseInt(priv[0]), Integer.parseInt(priv[1]));
            // ComplexNumber complexNumber2 = new ComplexNumber(Integer.parseInt(priv[3]), Integer.parseInt(priv[4]));
            System.out.println("\033\143");
            ComplexNumber complexNumber1 = new ComplexNumber(0, 0);
            ComplexNumber complexNumber2 = new ComplexNumber(0, 0);
            for (int i = 1; i < 3; i++) {
                int x = promptInt("Введите действительную часть " + i + " числа: ");
                int y = promptInt("Введите мнимую часть " + i + " числа: ");
                if (i == 1) {
                    complexNumber1 = new ComplexNumber(x, y);
                }
                if (i == 2) {
                    complexNumber2 = new ComplexNumber(x, y);
                }
            }
            while (true) {
                ComplexNumber result;
                String cmd = prompt("Введите команду (*, +, /) (x - выйти): ");
                if (cmd.equals("*")) {
                    result = calculator.multiply(complexNumber1, complexNumber2);
                    System.out.println("Результат " + result);
                    continue;
                }
                if (cmd.equals("+")) {
                    result = calculator.add(complexNumber1, complexNumber2);
                    System.out.println("Результат " + result);
                    continue;
                }
                if (cmd.equals("/")) {
                    result = calculator.divide(complexNumber1, complexNumber2);
                    System.out.println("Результат " + result);
                    continue;
                }
                if (cmd.equals("x")) {
                    break;
                }
            }
            break;
        }
    }
}
