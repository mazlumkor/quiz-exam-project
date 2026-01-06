// Abstract base class for questions
/**
 * Abstract Question class represents a generic quiz question.
 * It defines common properties and methods for all question types.
 */

public abstract class Question {

    protected String questionText;
    protected String correctAnswer;

    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract boolean checkAnswer(String userAnswer);
}

