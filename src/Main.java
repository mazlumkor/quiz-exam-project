import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        // 5 True / False questions
        quiz.addQuestion(new TrueFalseQuestion(
                "Java is an object oriented programming language. (true/false)",
                "true"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "A class can have multiple constructors. (true/false)",
                "true"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "Inheritance is not related to OOP. (true/false)",
                "false"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "The 'main' method is the entry point of a Java program. (true/false)",
                "true"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "In Java, variables do not need a data type. (true/false)",
                "false"
        ));

        // 5 Multiple Choice Questions
        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which keyword is used to inherit a class in Java?",
                "extends",
                Arrays.asList("extends", "implements", "import", "inherit")
        ));

        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which of the following is NOT a Java OOP concept?",
                "Compilation",
                Arrays.asList("Polymorphism", "Encapsulation", "Inheritance", "Compilation")
        ));

        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which method is the entry point of a Java application?",
                "main",
                Arrays.asList("start", "run", "main", "execute")
        ));

        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which keyword is used to create an object?",
                "new",
                Arrays.asList("create", "class", "new", "object")
        ));

        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which one is used to hide data?",
                "Encapsulation",
                Arrays.asList("Encapsulation", "Polymorphism", "Abstraction", "Inheritance")
        ));

        quiz.start();
    }
}
