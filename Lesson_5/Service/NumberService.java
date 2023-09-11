package Lesson_5.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lesson_5.Data.ComplexNumber;
import Lesson_5.Data.RationalNumber;

public class NumberService implements Number{
    Scanner scanner = new Scanner(System.in);
    private List<ComplexNumber> complexNumbers;
    private List<RationalNumber> rationalNumbers;

        public NumberService() {
        this.complexNumbers = new ArrayList<>();
        this.rationalNumbers = new ArrayList<>();
    }

    @Override
    public List<ComplexNumber> getComplexNumbers() {
        return complexNumbers;
    }
    @Override
    public List<RationalNumber> getRationalNumbers() {
        return rationalNumbers;
    }

    @Override
    public void complexCoupleNumber() {
        double x, y;
        for(int i = 0; i <=1; i++){
            String first = i == 1 ? "Введите второе число: " : "Введите первое число: ";
            System.out.println(first);
            x = scanner.nextDouble();
            String second = i == 1 ? "Введите i второго числа: " : "Введите i первого числа: ";
            System.out.println(second);
            y = scanner.nextDouble();
            complexNumbers.add(new ComplexNumber(x, y));
        }
    }
    @Override
    public void rationalCoupleNumber() {
        int x, y;
        for(int i = 0; i <=1; i++){
            String first = i == 1 ? "Введите числитель второго числа: " : "Введите числитель первого числа: ";
            System.out.println(first); 
            x = scanner.nextInt();
            String second = i == 1 ? "Введите делитель второго числа: " : "Введите делитель первого числа: ";
            System.out.println(second);
            y = scanner.nextInt();
            rationalNumbers.add(new RationalNumber(x, y));
        }
    }

    @Override
    public ComplexNumber addition(ComplexNumber x, ComplexNumber y) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setFirstPart(x.getFirstPart() + y.getFirstPart());
        temp.setSecondPart(x.getSecondPart()+y.getSecondPart());
        return temp;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setFirstPart(x.getFirstPart() - y.getFirstPart());
        temp.setSecondPart(x.getSecondPart()-y.getSecondPart());
        return temp;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber x, ComplexNumber y) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setFirstPart((x.getFirstPart() * y.getFirstPart()) - ((x.getSecondPart() * y.getSecondPart())));
        temp.setSecondPart((x.getSecondPart()*y.getFirstPart()) + ((x.getFirstPart() * y.getSecondPart())));
        return temp; 
    }

    @Override
    public ComplexNumber division(ComplexNumber x, ComplexNumber y) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.setFirstPart(((x.getFirstPart() * y.getFirstPart()) + (x.getSecondPart() * y.getSecondPart())) / 
                          ((y.getFirstPart() * y.getFirstPart()) + (y.getSecondPart() / y.getSecondPart())));
        temp.setSecondPart(((x.getSecondPart() * y.getFirstPart()) - (x.getFirstPart() * y.getSecondPart())) / 
                           ((y.getFirstPart() * y.getFirstPart()) + (y.getSecondPart() * y.getSecondPart())));
        return temp; 
    }

    @Override
    public RationalNumber addition(RationalNumber x, RationalNumber y) {
        RationalNumber temp = new RationalNumber(0, 0);
        temp.setNumerator(x.getNumerator() / x.getDivider());
        temp.setDivider(y.getNumerator() / y.getDivider());
        return temp;
    }

    @Override
    public RationalNumber subtraction(RationalNumber x, RationalNumber y) {
        RationalNumber temp = new RationalNumber(0, 0);
        temp.setNumerator(x.getNumerator() / x.getDivider());
        temp.setDivider(y.getNumerator() / y.getDivider());
        return temp;
    }

    @Override
    public RationalNumber multiplication(RationalNumber x, RationalNumber y) {
        RationalNumber temp = new RationalNumber(0, 0);
        temp.setNumerator(x.getNumerator() / x.getDivider());
        temp.setDivider(y.getNumerator() / y.getDivider());
        return temp;
        
    }

    @Override
    public RationalNumber division(RationalNumber x, RationalNumber y) {
        RationalNumber temp = new RationalNumber(0, 0);
        temp.setNumerator(x.getNumerator() / x.getDivider());
        temp.setDivider(y.getNumerator() / y.getDivider());
        return temp;
    }
}
