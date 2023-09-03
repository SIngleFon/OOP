package Lesson_3;



public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;
    private Integer maxTry;

    Log log = new Log();
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    public String getUserInput() {
        return userInput;
    }

    public Integer getBull() {
        return bull;
    }

    public Integer getCow() {
        return cow;
    }

    @Override
    public String toString() {
        String xaxa = ("Введено слово: "+userInput + ". Быков: "+bull+". Коров: "+cow+"\n");
        log.addLog(xaxa);
        return ("\nВведенное слово: " + userInput + "\n"
                + "Быков: " + bull 
                + ". Коров: " + cow + "\n"
                + "Осталось попыток: " + maxTry);
    }

    public Answer(String userInput, Integer bull, Integer cow, Integer maxTry) {
        this.userInput = userInput;
        this.bull = bull;
        this.cow = cow;
        this.maxTry = maxTry;
    }
}
