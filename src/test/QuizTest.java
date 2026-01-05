import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    @Test
    public void testInitialScoreIsZero() {

        Student student = new Student("Test Student", "000", "TestDept");
        Quiz quiz = new Quiz(student);

        assertEquals(0, quiz.getScore());
    }
}
