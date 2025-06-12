package chapt15;

import java.util.ArrayList;
import java.util.Collections;

//method reference usage in collections

public class CollectionMethRef {
    private int val;

    CollectionMethRef(int v){val = v;}

    int getVal() {
        return val;
    }
}

//compare() method compatible with one defined by the Comparable<T> interface

class RefFramework {
    static int compareMC(CollectionMethRef a, CollectionMethRef b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<CollectionMethRef> al = new ArrayList<CollectionMethRef>();

        al.add(new CollectionMethRef(20));
        al.add(new CollectionMethRef(45));
        al.add(new CollectionMethRef(78));
        al.add(new CollectionMethRef(32));

        CollectionMethRef maxValObject = Collections.max(al,RefFramework::compareMC);

        System.out.println("Maximum value is " + maxValObject.getVal());
    }
}
