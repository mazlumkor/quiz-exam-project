// Entry point of the quiz application

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter your department: ");
        String department = scanner.nextLine();

        Student student = new Student(name, studentId, department);

        System.out.println("\nWelcome " + student.getName() + " (" + student.getStudentId() + ")");
        System.out.println("Department: " + student.getDepartment());
        System.out.println("\n===== EXAM RULES =====");
        System.out.println("- You have 5 minutes to complete the exam");
        System.out.println("- You cannot leave answers blank");
        System.out.println("- Questions are shuffled randomly");
        System.out.println("- Your result will be shown at the end");
        System.out.println("======================");
        System.out.println("Press ENTER to start the exam...");
        scanner.nextLine();

        scanner.nextLine();


        Quiz quiz = new Quiz(student);


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

        System.out.println("\nStudent information saved successfully.");
        System.out.println("The exam will start shortly...");


        quiz.start();



    }
}
