package Classes;

public abstract class Question {

    protected String questionText;
    protected String answer;
    private int ID;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;

    }

    public Boolean checkAnswer(String userAnswer) {
        if(answer.equals(userAnswer)) {
            return true;
        }
        return false;
    }



}