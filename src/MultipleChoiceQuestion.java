import java.util.List;
import java.util.Scanner;


public class MultipleChoiceQuestion extends Question {

    private List<String> options;

    public MultipleChoiceQuestion(String questionText, String correctAnswer, List<String> options) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        userAnswer = userAnswer.trim().toUpperCase();

        while (!userAnswer.equals("A") &&
                !userAnswer.equals("B") &&
                !userAnswer.equals("C") &&
                !userAnswer.equals("D")) {

            System.out.println("Invalid input! Please enter only A, B, C or D: ");
            Scanner scanner = new Scanner(System.in);
            userAnswer = scanner.nextLine().trim().toUpperCase();
        }

        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

}

