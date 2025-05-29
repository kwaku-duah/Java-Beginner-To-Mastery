package chapt09;

public class ImplDefault implements DefaultInterface {
    //it has two methods, normal and default, only normal method is required

    public int normalMethod(){
        return 1000_000;
    }
    //it is possible to override the default method
    public String defaultMethod(){
        return "overriden";
    }
    
}
