package Lesson_5.Data;

public class RationalNumber {
    private double numerator;
    private double divider;

    public RationalNumber(double numerator, double divider){
        this.numerator = numerator;
        this.divider = divider;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDivider() {
        return divider;
    }

    public void setDivider(double divider) {
        this.divider = divider;
    }

    @Override
    public String toString() {
        return "Рациональные числа [" + numerator + "/" +divider + "]";
    }

    
}
