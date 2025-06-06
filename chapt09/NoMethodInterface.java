package chapt09;

interface NoMethodInterface {
    /*an interface may not have any methods
     * all fields in interfaces are final and must be initialized
     * once a class implements an interface without any method but just fields
     * it inherits the fields into its namespace
     */
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
    
}
