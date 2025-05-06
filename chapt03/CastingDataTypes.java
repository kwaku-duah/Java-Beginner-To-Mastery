package chapt03;

public class CastingDataTypes {
    /* there is automatic type conversion and casting
     * automatic type conversion is done by java automatically if:
     * target types are compatible
     * if the destination type is larger than the source type
     * (example) -- convert from byte to int ( widening conversion)
     * 
     * However, casting is done explicitly by the programmer using
     * (target-type) value with target type in closed parenthesis to cast
     */
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        //cast int to byte
        b = (byte) i;
        System.out.println("Converting int to byte achieved through type casting "  + i + " " + b);

        //cast double to int
        i = (int) d;
        System.out.println("Casting double to int " + d + " " + i);

        //cast double to byte
        b = (byte) d;
        System.out.println("Casting double to byte "+ d + " " + b );
    } 
}
