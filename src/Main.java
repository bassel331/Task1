import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("What is the capital of France?",
                new ArrayList<>(Arrays.asList("Paris", "London", "Berlin", "Madrid")), "Paris"));
        questions.add(new Question("What is 2 + 2?",
                new ArrayList<>(Arrays.asList("3", "4", "5", "6")), "4"));
        questions.add(new Question("What is the largest planet in our solar system?",
                new ArrayList<>(Arrays.asList("Earth", "Mars", "Jupiter", "Saturn")), "Jupiter"));
        questions.add(new Question("What is the chemical symbol for gold?",
                new ArrayList<>(Arrays.asList("Au", "Ag", "Pb", "Pt")), "Au"));
        questions.add(new Question("What is the boiling point of water?",
                new ArrayList<>(Arrays.asList("90", "100", "110", "120")), "100"));

        questions.add(new Question("Who was the first President of the United States?",
                new ArrayList<>(Arrays.asList("George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams")), "George Washington"));
        int i=1;
        HashMap<String, Double> userScores = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        QuizApplication Qa = new QuizApplication(userScores);
        while(true){
            System.out.println("Please enter your username:" );
            String inputName = scanner.nextLine();
            Quiz quiz=new Quiz(questions);
            User user = new User(inputName,quiz);
            System.out.println("HELLO "+inputName );
            while(i<6){
                System.out.println("Question "+ i +": " +user.quiz.questions.get(i-1).text);
                System.out.println(user.quiz.questions.get(i-1).getAnswers());
                String inputAnswer = scanner.nextLine();
                boolean correct = user.quiz.questions.get(i-1).isCorrectAnswer(inputAnswer);
                if(correct){
                    user.quiz.numberOfCorrectAnswers++;
                }
                System.out.println(correct);
                i++;
            }
            userScores.put(inputName,user.quiz.getNumberOfCorrectAnswers());
            System.out.println("Congratulations "+ inputName+" your score is "+user.quiz.getNumberOfCorrectAnswers());
            System.out.println("Type 'yes' if there is someone present. Type 'no' if no one is around.");
            String nextOne = scanner.nextLine();
            if(nextOne.equalsIgnoreCase("no")){
                System.out.println("User Scores:");
                for (Map.Entry<String, Double> entry : userScores.entrySet()) {
                    String user2 = entry.getKey();
                    Double score = entry.getValue();
                    System.out.println(user2 + ": " + score +"%");
                }
                return;
            }
            else{
                i=1;
            }
        }
    }
}
