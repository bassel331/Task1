import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
   private int numberOfCorrectAnswers = 0;
    Quiz(ArrayList<Question> questions){
        this.questions = questions;
    }
    public void addQuestion(Question question){
        questions.add(question);
    }
    public ArrayList<Question> getQuestions(){
        return questions;
    }
    public void setNumberOfCorrectAnswers(int numberOfCorrectAnswers){
        this.numberOfCorrectAnswers = numberOfCorrectAnswers;
    }
    public int getNumberOfCorrectAnswers(){
        return (int) ((numberOfCorrectAnswers/5.0)*100);
    }

}
