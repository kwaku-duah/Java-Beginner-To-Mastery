package chapt09;

interface PrivateMethodInterface {
    /*private methods are allowed in interfaces
     * with private methods they cannot be inherited by subinterfaces
     * or classes that implement them
     * they can be accessed through a default methods or
     * other private methods designed to access them within the same interface
     * 
     * 
     */
    //methods in interface
    void push(int item);
    int pop();

    //private method
    private int[] getElements(int n) {

        int[] elements = new int[n];

        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }

    //access to this private method through a default method
    default int[] popNElements(int n){
        //return the popped elements
        return getElements(n);
    }

    //access using another default
    default int[] skipAndPopNElements(int skip, int n){

        //skip by
        getElements(skip);
        
        //return getElements
        return getElements(n);
    }


}
