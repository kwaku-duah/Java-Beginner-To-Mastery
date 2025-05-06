package chapt03;

public class LongIntType {
    /* Integer data types are: byte, short, int and long 
     * use int for values you don't expect to be too big
     * use long for milliseconds, recommended, or 
     * anything that could be long, using INT where LONG must 
     * be used will result in integer overflow!
    */
    public static void main(String[] args) {
        //program to compute distance light travels
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in m/s
        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.println(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
