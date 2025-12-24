import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestionText());

            // Eğer Multiple Choice soru ise şıkları göster
            if (q instanceof MultipleChoiceQuestion) {
                MultipleChoiceQuestion mcq = (MultipleChoiceQuestion) q;
                List<String> options = mcq.getOptions();

                char optionLetter = 'A';
                for (String option : options) {
                    System.out.println(optionLetter + ") " + option);
                    optionLetter++;
                }
            }

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (q.checkAnswer(userAnswer)) {
                score++;
            }

            System.out.println("---------------------");
        }

        System.out.println("Quiz finished!");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }
}
