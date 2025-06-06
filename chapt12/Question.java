package chapt12;

import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

public class Question {
    /*in chapter 9, I used an interface that took NO, YES, MAYBE
     * right now, I will use enums to implement same program, this is much better
     */
  Answers ask() {
    Random rand = new Random();
    int prob = (int) (100 * rand.nextDouble());

    if ( prob < 15) return Answers.MAYBE;
    else if (prob < 30) return Answers.NO;
    else if (prob < 60) return Answers.YES;
    else if (prob < 75) return Answers.LATER;
    else if (prob < 98) return Answers.SOON;
    else return Answers.NEVER;
  }


}


class AskMe {

    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}