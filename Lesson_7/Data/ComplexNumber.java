package Lesson_7.Data;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;


    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return "Комплексные числа[Действительная часть=" + realPart + ", мнимая часть=" + imaginaryPart + "i]";
    }

}
