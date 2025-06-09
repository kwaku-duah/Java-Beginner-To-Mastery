package chapt14;

class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int q) {
        super(a, b, c);
        t = q;
    }

}

public class BoundedWildCards {
    /*
     * wildcards are represented with ? indicating unknown types
     * wildcards can be bounded pretty much the same way as type parameters
     */
}
