package Day9_Quiz_Game;
import java.util.Scanner;

public class QuizGame {
    private static int score = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to the Quiz Game!");
        playLevel(new EasyLevel(), 3);

        if (score >= 30) {
            playLevel(new MediumLevel(), 2);
        }

        if (score >= 50) {
            playLevel(new HardLevel(), 2);
        }

        System.out.println("\n🏆 Final Score: " + score);
    }

    private static void playLevel(Level level, int minCorrectToPass) {
        System.out.println("\n--- " + level.getLevelName() + " Level ---");
        int correctCount = 0;

        for (Question q : level.getQuestions()) {
            if (q.askQuestion(sc)) {
                System.out.println(" Correct!");
                score += 10;
                correctCount++;
            } else {
                System.out.println(" Wrong!");
            }
        }

        if (correctCount >= minCorrectToPass) {
            System.out.println(" You passed " + level.getLevelName() + " level!");
        } else {
            System.out.println("You failed at " + level.getLevelName() + " level. Game Over!");
            System.out.println(" Final Score: " + score);
            System.exit(0);
        }
    }
}