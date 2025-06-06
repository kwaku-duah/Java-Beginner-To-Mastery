package chapt09;

interface StaticInterface {
    //normal method
    int getNumber();

    //default method
    default String defaultMethod(){
        return "Default String";
    }

    //static method in interfaces
    /*static methods can be called independently of any class or obj 
     * preceded by ...static
    */

    static int getDefaultNumber(){
        return 0;
    }

    public static void main(String[] args) {
        /*implementation
         * is simply staticInterface.methodname
         */
        
        int trialDef = StaticInterface.getDefaultNumber();
        System.out.println(trialDef);
    }

}
