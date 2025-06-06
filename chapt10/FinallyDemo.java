package chapt10;

public class FinallyDemo {

    static void finDem() {
        try{
            System.out.println("inside first");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("first finally");
        }
    }

    static void finDemB() {
        try{
            System.out.println("B");
            return;
        } finally {
            System.out.println("second finally");
        }
    }

    static void finDemC() {
        try {
            System.out.println("third");
        } finally {
            System.out.println("third finally");
        }
    }

    public static void main(String[] args) {
        try {
            finDem();
        } catch(Exception e){
            System.out.println("last found");
        }

        finDemB();
        finDemC();
    }
}
