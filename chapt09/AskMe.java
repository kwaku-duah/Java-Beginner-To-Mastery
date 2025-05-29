package chapt09;

public class AskMe implements NoMethodInterface {
    static void answer(int result) {
        switch(result) {
            case NO:
                System.out.println("result is NO");
                break;
            case YES:
                System.out.println("result is YES");
                break;
            case LATER:
                System.out.println("result is LATER");
                break;
            case MAYBE:
                System.out.println("result MAYBE");
                break;
            case SOON:
                System.out.println("result is SOON");
                break;
            case NEVER:
                System.out.println("result is NEVER");
                break;
        }
    }

   public static void main(String[] args) {
    SharedConstants obj = new SharedConstants();

    answer(obj.ask());
    
    answer(obj.ask());

    answer(obj.ask());
   }

}
