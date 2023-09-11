package Lesson_5.Contoller;

import java.util.List;

import Lesson_5.Data.ComplexNumber;
import Lesson_5.Data.RationalNumber;
import Lesson_5.Service.NumberService;

public class Controller {
    NumberService numberService = new NumberService();
    Lesson_5.View.UserView userView = new Lesson_5.View.UserView();
    String text = "1. Сложить\n" + "2. Вычесть\n" + "3. Умножить\n" + "4. Разделить\n" + "5. Лог";

    public void start() {
        System.out.println("1. Комплексные\n" + "2. Рациональные");
        int q = userView.scanner();
        switch (q) {
            case 1:
                numberService.complexCoupleNumber();
                userView.appendLog("Работа с Комплексными числами\n");
                Complex(numberService.getComplexNumbers());
                break;
            case 2:
                numberService.rationalCoupleNumber();
                userView.appendLog("Работа с Рациональными числами\n");
                Rational(numberService.getRationalNumbers());
                break;
            default:
                start();
        }
    }

    private void Rational(List<RationalNumber> rationalNumbers) {
        System.out.println(text);
        userView.appendLog(numberService.getRationalNumbers());
        int q = userView.scanner();
        List<RationalNumber> list = numberService.getRationalNumbers();
        RationalNumber rationalNumber;
        switch (q) {
            case 1:
                rationalNumber = numberService.addition(list.get(0), list.get(1));
                userView.appendLog("\nСложение ответ: " + (rationalNumber.getDivider() + rationalNumber.getNumerator()));
                System.out.println("Ответ: "+ rationalNumber.getDivider() + rationalNumber.getNumerator());
                Rational(numberService.getRationalNumbers());
                break;
            case 2:
                rationalNumber = numberService.subtraction(list.get(0), list.get(1));
                System.out.println("Ответ: " + (rationalNumber.getNumerator() - rationalNumber.getDivider()));
                userView.appendLog("\nВычитание ответ: " + (rationalNumber.getNumerator() - rationalNumber.getDivider()));
                Rational(numberService.getRationalNumbers());
                break;
            case 3:
                rationalNumber = numberService.addition(list.get(0), list.get(1));
                System.err.println("Ответ: "+ rationalNumber.getNumerator() * rationalNumber.getDivider());
                userView.appendLog("\nУмножение ответ: " + (rationalNumber.getNumerator() * rationalNumber.getDivider()));
                Rational(numberService.getRationalNumbers());
                break;
            case 4:
                rationalNumber = numberService.addition(list.get(0), list.get(1));
                System.err.println("Ответ: "+ rationalNumber.getNumerator() / rationalNumber.getDivider());
                userView.appendLog("\nДеление ответ: " + (rationalNumber.getNumerator() / rationalNumber.getDivider()));
                Rational(numberService.getRationalNumbers());
                break;
            case 5:
                System.err.println(userView.log);
                break;
            default: 
                System.out.println("Ошибка ввода");
                Rational(numberService.getRationalNumbers());
        }
    }

    public void Complex(List<ComplexNumber> complexNumbers) {
        System.out.println(text);
        userView.appendLog(numberService.getComplexNumbers());
        int q = userView.scanner();
        List<ComplexNumber> list = numberService.getComplexNumbers();
        ComplexNumber complexNumber;
        switch (q) {
            case 1:
                complexNumber = numberService.addition(list.get(0), list.get(1));
                System.out.println(complexNumber.toString());
                userView.appendLog("\nСложение ответ: " + complexNumber);
                Complex(numberService.getComplexNumbers());
                break;
            case 2:
                complexNumber = numberService.subtraction(list.get(0), list.get(1));
                System.out.println(complexNumber.toString());
                userView.appendLog("\nВычитание ответ: " + complexNumber);
                Complex(numberService.getComplexNumbers());
                break;
            case 3:
                complexNumber = numberService.multiplication(list.get(0), list.get(1));
                System.out.println(complexNumber.toString());
                userView.appendLog("\nУмножение ответ: " + complexNumber);
                Complex(numberService.getComplexNumbers());
                break;
            case 4:
                complexNumber = numberService.division(list.get(0), list.get(1));
                System.out.println(complexNumber.toString());
                userView.appendLog("\nДеление ответ: " + complexNumber);
                Complex(numberService.getComplexNumbers());
                break;
            case 5:
                System.out.println(userView.log);
                break;
            default: 
                System.out.println("Ошибка ввода");
                Complex(numberService.getComplexNumbers());
        }
    }
}
