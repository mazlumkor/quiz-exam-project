import java.util.Scanner;
/**
 * TrueFalseQuestion represents a question with only two possible answers: true or false.
 * It extends the Question class and implements its own answer validation.
 */

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        userAnswer = userAnswer.trim().toLowerCase();

        while (!userAnswer.equals("true") && !userAnswer.equals("false")) {
            System.out.println("Invalid input! Please type only 'true' or 'false': ");
            Scanner scanner = new Scanner(System.in);
            userAnswer = scanner.nextLine().trim().toLowerCase();
        }

        return userAnswer.equalsIgnoreCase(correctAnswer);
    }

}
