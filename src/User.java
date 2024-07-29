public class User {
    private String name;
    private Quiz quiz;

    User(String name,Quiz quiz ) {
        this.name = name;
        this.quiz = quiz;
    }
    public String getName() {
        return name;

    }
    public Quiz getQuiz() {
        return quiz;
    }
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void setName(String name) {
        this.name = name;
    }
}
