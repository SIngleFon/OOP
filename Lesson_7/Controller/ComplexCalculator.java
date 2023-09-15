package Lesson_7.Controller;


import Lesson_7.Data.ComplexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexCalculator implements Calculator {
    private Logger logger;
    private  ComplexNumber result;
    public ComplexCalculator() {
        logger = Logger.getLogger(ComplexCalculator.class.getName());

    }

    @Override
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() + number2.getRealPart();
        double imaginaryPart = number1.getImaginaryPart() + number2.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Example: " + number1 +" + " + number2 + "\nAddition result: "
                + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() * number2.getRealPart() -
                number1.getImaginaryPart() * number2.getImaginaryPart();
        double imaginaryPart = number1.getRealPart() * number2.getImaginaryPart() +
                number1.getImaginaryPart() * number2.getRealPart();
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Example: " + number1 +" + " + number2 + "\nMultiplication result: "
                + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        double denominator = number2.getRealPart() * number2.getRealPart() +
                number2.getImaginaryPart() * number2.getImaginaryPart();
        double realPart = (number1.getRealPart() * number2.getRealPart() +
                number1.getImaginaryPart() * number2.getImaginaryPart()) / denominator;
        double imaginaryPart = (number1.getImaginaryPart() * number2.getRealPart() -
                number1.getRealPart() * number2.getImaginaryPart()) / denominator;
        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logger.log(Level.INFO, "Example: " + number1 +" + " + number2 + "\n"+
                "Division result: " + result.getRealPart() + " + " +
                result.getImaginaryPart() + "i");
        return result;
    }

    public ComplexNumber getResult() {
        return result;
    }
}
