package Lesson_5.Service;

import java.util.List;

import Lesson_5.Data.ComplexNumber;
import Lesson_5.Data.RationalNumber;

public interface Number {
    public List<ComplexNumber> getComplexNumbers();
    public List<RationalNumber> getRationalNumbers();

    public void complexCoupleNumber();
    public void rationalCoupleNumber();
    public ComplexNumber addition(ComplexNumber x,ComplexNumber  y);
    public ComplexNumber subtraction(ComplexNumber x,ComplexNumber  y);
    public ComplexNumber multiplication(ComplexNumber x,ComplexNumber  y);
    public ComplexNumber division(ComplexNumber x,ComplexNumber  y);
    
    public RationalNumber addition(RationalNumber x, RationalNumber y);
    public RationalNumber subtraction(RationalNumber x, RationalNumber y);
    public RationalNumber multiplication(RationalNumber x, RationalNumber y);
    public RationalNumber division(RationalNumber x, RationalNumber y);
}
