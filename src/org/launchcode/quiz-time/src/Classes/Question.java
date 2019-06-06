package Classes;

public abstract class Question {

    protected String questionText;
    protected String answer;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

}