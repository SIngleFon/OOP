package Lesson_5.Data;

public class ComplexNumber {
    private double firstPart;
    private double secondPart;

    public ComplexNumber(double firstPart, double secondPart){
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    public void setFirstPart(double x){
        firstPart = x;
    }

    public double getFirstPart(){
        return firstPart;
    }

    public void setSecondPart(double x){
        secondPart = x;
    }

    public double getSecondPart(){
        return secondPart;
    }
    @Override
    public String toString() {
        if(secondPart >= 0){
            return "Комплексные числа["+ firstPart + "+" + secondPart + "i]";
        } else {
            return "Комплексные числа[" + firstPart + secondPart + "i]";
        }
    }
}
