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

// next here is a generic class that specifies TwoD as an upper boundary
class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

}

// a method that shows what is in the arrays, at least we know that it has at
// least an x and y coordinate

public class BoundedWildCards {
    /*
     * wildcards are represented with ? indicating unknown types
     * wildcards can be bounded pretty much the same way as type parameters
     */
    // method to show objects in Coords
    static void showXY(Coords<?> c) {
        System.out.println("X and Y coordinates");
        for (int i = 0; i < c.coords.length; i++) 
            System.out.println("x and y component of the object " + c.coords[i].x + ", " + c.coords[i].y);
            
            System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X, Y, Z coordinates");
        for (int i = 0; i < c.coords.length; i++) System.out.println("x, y and z components " +  c.coords[i].x + " " +  c.coords[i].y + " " +  c.coords[i].y);

        System.out.println();
        
    }

    static void showXYZT(Coords<? extends FourD> c) {
        for (int i = 0; i < c.coords.length; i++) System.out.println("X, Y, Z, T coordinates " + 
        c.coords[i].x + " " + c.coords[i].y + " " +  c.coords[i].z + " " +  c.coords[i].t);
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] one  = {
            new TwoD(0, 0),
            new TwoD(9, 7),
            new TwoD(18, 4),
            new TwoD(-1, -23)
        };

        //two D
        Coords<TwoD> tdlocs = new Coords<TwoD>(one);
        System.out.println("Contents of tdlocs");

        showXY(tdlocs);
        // showXYZ(tdlocs); Error
        // showXYZT(tdlocs);

       // three D 
        ThreeD[] thdlocs = {
            new ThreeD(1, 3, 5),
            new ThreeD(3, 6, 7),
            new ThreeD(5, 7, 5)
        };
        System.out.println("Contents of three dimensional ");
        Coords<ThreeD> th = new Coords<ThreeD>(thdlocs);

        showXYZ(th);

        FourD[] four = {
            new FourD(2, 4, 7, 7),
            new FourD(4, 6, 7, 8),
            new FourD(36, -21, 45, -78)
        };

        System.out.println("4 coordinates from fourD array");

        Coords<FourD> fd = new Coords<FourD>(four);
        //calling its the method on it
        showXYZT(fd);
        
    }

    

    
}
