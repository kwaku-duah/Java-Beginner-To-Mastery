package chapt15;

/*
 * method references that works with different objects
 */
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

// class that stores temperature high for a day
class HighTemp {
    int hTemp;

    HighTemp(int high) {
        hTemp = high;
    }

    // .return true if the invoking object has the same
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // return true if the invoking objects has a lesser temperature
    boolean lessTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class DifferentObjects {

    // instance method without specific object referece demonstration for
    // which some specified criteria works for it, like Myfunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {

        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v))
                count++;
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHigh = {
                new HighTemp(20), new HighTemp(87),
                new HighTemp(67), new HighTemp(45),
                new HighTemp(10), new HighTemp(45)
        };

        count = counter(weekDayHigh, HighTemp::sameTemp, new HighTemp(45));
        System.out.println(count + " had a high in the week");

        // now use less Temp
        count = counter(weekDayHigh, HighTemp::lessTemp, new HighTemp(12));
        System.out.println(count + " days of the week");

    }
}
