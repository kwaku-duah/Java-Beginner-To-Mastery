package chapt12;


public class TypeWrapper {
    /*Type wrappers are very important
     * primitive(simple) data types made way for efficiency, performance-wise
     * however, they are not objects and do not inherit from objects
     * However, sometimes you may want to pass it a type reference, primitive
     * data types cannot, hence wrapping them to become objects become necessary
     * it is done with a static method value0f
     * the wrapper classes are Byte, Long, Short, Int, Float, Double, Character
     * and Boolean
     * to make them objects
     * static (wrapperClassType) valueOf(primitive data type ref-for-object-to-wrap)
     * to get the value from a wrapper class 
     * (primitive type) primitiveType+Value() e.g char charValue(), boolean booleanValue()
     * byte byteValue() int intValue() short shortValue() float floatValue() long longValue()
     */
    
     //demonstration of type wrapping

     public static void main(String[] args) {
        
        //wrapper classes are prefixed with static, they are to be called independently

        Integer iOB = Integer.valueOf(100); //iOb is an object, it is a wrapped integer object with Integer
        /*process of encapsulating a value within an object is called BOXING */



       int i = iOB.intValue(); //getting the value of iOB
       /*process of extracting a value from a type wrapper is called unboxing */
       System.out.println(i);

        System.out.println("value of iOB is " + i);
     }
}
