import java.util.ArrayList;
import java.util.List;

public class Quiz {
    ArrayList<Question> questions = new ArrayList<Question>();
    int numberOfCorrectAnswers = 0;
    Quiz(ArrayList<Question> questions){
        this.questions = questions;
    }
    public void addQuestion(Question question){
        questions.add(question);
    }
    public ArrayList<Question> getQuestions(){
        return questions;
    }
    public double getNumberOfCorrectAnswers(){
        return (numberOfCorrectAnswers/5.0)*100;
    }

}
