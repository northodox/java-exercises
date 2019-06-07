package Classes;

public class Checkbox extends Question{

    private String boxes;

    public Checkbox(String questionText, String answer, String boxes) {
        super(questionText, answer);
        this.boxes = boxes;
    }

}
