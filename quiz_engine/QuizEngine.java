package quiz_engine;

import java.util.Scanner;

public class QuizEngine {
    private Question[] questions;

    public QuizEngine(Question[] ques) {
        this.questions = ques;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            q.ask();
            System.out.println("Your answer ");

            String ans = scanner.nextLine();
            if (q.checkAnswer(ans)) {
                System.out.println("Correct answer!\n");
                score++;
            } else
                System.out.println("Wrong answer " + "correct answer was " + q.getCorrectAnswer() + "\n");

        }
        System.out.println("Final score: " + score + " out of " + questions.length);
        scanner.close();
    }

}
