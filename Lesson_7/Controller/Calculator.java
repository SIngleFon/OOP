package Lesson_7.Controller;

import Lesson_7.Data.ComplexNumber;

public interface Calculator {
    ComplexNumber add(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber divide(ComplexNumber number1, ComplexNumber number2);
}
