package chapt09;

interface AddingInstack {
    /*possible to have an extra method that works out of box */
    void push(int item);
    int pop();

    /* a possible extension that would not break existing code
     * 
     */
    default void clear(){
        System.out.println("A default method with no implementation");
    }
}
