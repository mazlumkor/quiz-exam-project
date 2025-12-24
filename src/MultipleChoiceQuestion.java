import java.util.List;

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
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}

