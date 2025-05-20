package chapt07;

public class ExampleRecursive {
    /*defining a method in terms of itself
     * 
     */
    int[] values;

    //recursive method
    ExampleRecursive(int i) {
        values = new int[i];
    }

    void PrintArray(int i){
        if (i==0) return;
        else PrintArray(i-1);
        System.out.println("[" + (i-1)  + "]" + values[i-1]);
    }
}


class ExerciseDepth {
    public static void main(String[] args) {
        ExampleRecursive obj = new ExampleRecursive(10);
        int i;

        for (i = 0; i < 10; i++) obj.values[i] = i;
        obj.PrintArray(10);
    }
}
