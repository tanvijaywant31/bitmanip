
public class BitManipBasics {

    public static void main(String args[]) {

        System.out.println();

        /**
         * http://www.java2s.com/Code/Java/Language-Basics/Bitwisecomplementinvertsonesandzeroesinanumber.htm
         * http://stackoverflow.com/questions/1483504/java-what-does-mean
         *
         * It ALSO flips the sign bit.
         *
         *   ~ operator.
         */
        int x = 5;

        // negate a number.
        System.out.println(~x);         // prints -6.


        System.out.println(x = ~x + 1); // prints -5
        System.out.println(x = ~x + 1); // prints  5

        /**
         *  shift
         */
        int y = 2;
        // multiply  by 2
        System.out.println(y = y << 1); // prints  4
        // divide  by 2
        System.out.println(y = y >> 1); // prints  2
        int yneg = -8;
        System.out.println(yneg <<= 1); // prints -16, <<= is same as +=.
        System.out.println(yneg = yneg >> 1); // prints -8

        /**
         * Unary shift.
         */
        y = 4;
        // multiply  by 2
        // System.out.println(y = y <<< 1); // prints  4 (unary left shift does not exist.
        // divide  by 2
        System.out.println(y = y >>> 1); // prints  2
        yneg = -8;
        System.out.println(yneg = yneg >>> 1); // prints 2147483644 (includes the sign bit, thus unsigned, as sign bit is included in the number)


        /**
         * & opertor
         */
        int z = 2;
        System.out.println(z & 1);  // prints 0.
        z = 3;
        System.out.println(z & 1);

        /**
         * XOR
         * http://stackoverflow.com/questions/1991380/what-does-the-operator-do-in-java
         */
        int p = 4;
        p ^= 2;
        System.out.println("_______ " + p);


        /**
         * multiply any number with 2.
         */
        int q = 3;
        q = q << 1; // ( 3 * 2 )
        System.out.println(q);
        q = q << 1;  // (3 * 4 )
        System.out.println(q);

        /**
         * bit-wise or |=
         * http://www.vipan.com/htdocs/bitwisehelp.html
         */
        int r = 6;
        r |= 1; // same as r = r | 1;
        System.out.println(r); // prints 7.

    }
}
