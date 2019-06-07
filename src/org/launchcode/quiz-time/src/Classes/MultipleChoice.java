package Classes;

public class MultipleChoice extends Question {

    private String choices;

    public MultipleChoice(String questionText, String answer, String choices) {
        super(questionText, answer);
        this.choices = choices;
    }
}
