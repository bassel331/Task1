public class User {
    String name;
    Quiz quiz;
    int numberOfCorrectAnswers;
    User(String name,Quiz quiz ) {
        this.name = name;
        this.quiz = quiz;
        this.numberOfCorrectAnswers = 0;
    }


}
