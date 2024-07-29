import java.util.ArrayList;
import java.util.List;

public class Question {
    String text;
    ArrayList<String> answers;
    String correctAnswer;

    public Question(String text, ArrayList<String> answers, String correctAnswer) {
        this.text = text;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}
