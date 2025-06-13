package chapt17;

/* records are a new addition in java
 * super useful as they already implement a getter and setter classes for fields
 * records reduce verbose code, instantialise all fields and and make it private
 * it uses canonical constructors and it is used to create aggregated data
 * record is created with the keyword record
 */

//record class that instantializes private fields, name, idnum and read only accessors
//name() and idNum()

record Employee(String name, int idNum) {
}

public class StructureRecord {
    public static void main(String[] args) {
        // create an array of employee
        Employee[] emp = new Employee[5];

        // create the list of employees that uses the
        emp[0] = new Employee("Kwaku, Duah", 0);
        emp[1] = new Employee("Hansen, Grettel", 1);
        emp[2] = new Employee("Shakespeare, Teller", 2);
        emp[3] = new Employee("Attaa, Ayi", 3);
        emp[4] = new Employee("Vincent, Antwi", 4);

        //use record accessors to access the get fields
        for (Employee eList: emp) 
            System.out.println("The employees " + eList.name()  + " order " + eList.idNum());
    }
}
