package chapt08;

public class OrderExecution {
    /*order of execution of classes, subclasses
     * 
     */
    OrderExecution() {
        System.out.println("Constructor inside mother superclass");
    }
}

class Next extends OrderExecution {
    Next(){
        System.out.println("Constructor inside first subclass");
    }
}


class LastOne extends Next {
    LastOne() {
        System.out.println("last subclass");
    }
}

//demonstrating order of execution
class ExecutionOrder {
    public static void main(String[] args) {
        LastOne last = new LastOne();
        System.out.println(last);
    }
}
