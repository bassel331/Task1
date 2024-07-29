import java.util.*;

public class QuizApplication {
    private HashMap<String, Integer> userScores;
    QuizApplication(HashMap<String, Integer> userScores) {
        this.userScores = userScores;
    }

    public HashMap<String, Integer> getUserScores() {
        return userScores;
    }

    public void setUserScores(HashMap<String, Integer> userScores) {
        this.userScores = userScores;
    }
}
