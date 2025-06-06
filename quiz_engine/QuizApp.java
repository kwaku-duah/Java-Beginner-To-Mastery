package quiz_engine;

public class QuizApp {
    public static void main(String[] args) {

        Question[] questions = {
            new Question("Is Java platform independent?", "true", QuestionType.TRUE_FALSE),
            new Question("Which company developed Java (A) Sun (B) Microsoft (C) Oracle", "A", 
            QuestionType.MCQ)
        };

        QuizEngine st = new QuizEngine(questions);
        st.start();
    }
}
