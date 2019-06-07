package Classes;


import java.util.Objects;

public abstract class Question {

    protected String questionText;
    protected String answer;
    private int questionID;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public String receiveAnswer(String userAnswer) {
        return userAnswer.toUpperCase();
    }

    public Boolean checkAnswer(String userAnswer) {
        if (answer.equals(receiveAnswer(userAnswer))) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return answer.equals(question.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer);
    }

}