package chapt09;

import java.util.Random;

public class SharedConstants implements NoMethodInterface  {

    Random rand = new Random();
    int prob = (int) (75 * rand.nextDouble());


    int ask() {
        if (prob < 30) 
            return NO;
        else if (prob < 60)
            return YES;
        else if ( prob < 75)
            return LATER;
        else if ( prob < 98)
            return SOON;
        else return NEVER;
    }


}
