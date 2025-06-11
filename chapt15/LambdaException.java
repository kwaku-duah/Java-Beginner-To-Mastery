package chapt15;


interface FunctInterface {
    double f(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super("Array is empty");
    }
}


public class LambdaException {
    //lambda expressions may throw exceptions thrown by the functional interface interface
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = { 1.0, 2.0, 3.0, 4.0, 5.0};

        FunctInterface average = (n) -> {
            double sum = 0;
            //check if anything exists
            if(n.length == 0)
                throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                sum += n[i];

            return sum / n.length;
        };

        System.out.println("The average is " + average.f(values));

        //throws an error because of zero length array
        System.out.println("The average, this throws an error " + average.f(new double[0]));

    }
}
