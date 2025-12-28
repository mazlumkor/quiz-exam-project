import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Quiz {

    private List<Question> questions;
    private int score;
    private Student student;


    private long startTime;
    private long examDuration = 5 * 60 * 1000; // 5 dakika




    public Quiz(Student student) {
        this.student = student;
        questions = new ArrayList<>();
        score = 0;
    }


    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        startTime = System.currentTimeMillis();
        System.out.println("\nExam started! You have 5 minutes.");

        Collections.shuffle(questions);
        System.out.println("Questions are shuffled randomly!");




        for (Question q : questions) {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = currentTime - startTime;

            if (elapsedTime >= examDuration) {
                System.out.println("\nTime is over! Exam finished automatically.");
                break;
            }

            long remaining = (examDuration - elapsedTime) / 1000;
            System.out.println("Remaining Time: " + remaining + " seconds");

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
        System.out.println("\n===== Exam Finished =====");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Correct Answers: " + score + "/" + questions.size());

        double percentage = (score * 100.0) / questions.size();
        System.out.println("Score: " + percentage + "%");
        System.out.println("=========================");

    }
}
