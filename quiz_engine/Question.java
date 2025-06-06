package quiz_engine;

public class Question {
    private String question;
    private String answer;
    private QuestionType type;

    public Question(String question, String answer, QuestionType type){
        this.question = question;
        this.answer = answer;
        this.type = type;
    }

    public boolean checkAnswer(String input){
        return answer.equalsIgnoreCase(input.trim());
    }

    public void ask(){
        System.out.println("[ " + type + " ]" + question);
    }
}
