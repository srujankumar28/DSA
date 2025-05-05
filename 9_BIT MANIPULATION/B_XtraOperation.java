import java.security.PublicKey;

public class B_XtraOperation {

    // GET THE iTH BIT
    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;

        } else {
            return 1;
        }
    }

    // SET ITH BIT

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;

    }

    // CLEAR ITH BIT

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }

    // UPDATE ITH BIT
    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithbit(n, i);

        } else {
            return setithbit(n, i);
        }
    }

    // CLEAR THE ITH NUMBER OF BITS FORM LAST

    public static int clearithbit_s(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    // CLEAR THE RANGE OF BITS

    public static int clearithbitRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;

    }

    public static void main(String args[]) {
        System.out.println(getithbit(10, 1));
        System.out.println(setithbit(10, 2));
        System.out.println(clearithbit(10, 1));
        System.out.println(updateithbit(10, 1, 0));
        System.out.println(clearithbit_s(15, 2));
        System.out.println(clearithbitRange(10, 2, 4));

    }

}
