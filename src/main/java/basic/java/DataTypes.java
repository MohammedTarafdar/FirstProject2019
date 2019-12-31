package basic.java;

public class DataTypes {

    public static void main(String [] args){

        /*
        1. byte
        size: 1 byte = 8 bits
        range = -128 to 127
         */

        byte b = 10;
        System.out.println(b);
        b = 20;
        System.out.println(b);
        byte b1 = -128;
        byte b2 = 127;
        System.out.println("The lowest number can be hold in byte is: "+b1);
        System.out.println("The height number can be hold in byte is: "+b2);

        /*
        2. short
        size: 2 bytes = 16 bits
        range: -32768 to 32767
         */

        short s = 10654;
        short s1 = -135;
        System.out.println("The short value of s is: "+s);
        System.out.println("The short value of s1 is: "+s1);

        /*
        3. int
        size: 4 bytes = 32 bits
         */

        int i = 325;
        int i1 = 567385983;

        System.out.println("The int value of i is: "+i);
        System.out.println("The int value of i1 is: "+i1);

        /*
        4. long
        size: 8 bytes= 64 bits
         */

        long l = 423343321879348756l;
        long l1 = -12345678901234567l;

        System.out.println("The long value is really long: "+l);
        System.out.println("The long value is really long: "+l1);

        /*
        5. float
        size: 4 bytes = 32 bits
         */

        float f = 12.33f;
        float f1 = (float)35.123456;
        float f2 = 100;

        System.out.println("The floating value of f is: "+f);
        System.out.println("The floating value of f is: "+f1);
        System.out.println("Float also take the int value so the value of f2 is: "+f2);

        /*
        6. double
        size: 8 bytes = 64 bits
         */

        double d = 25.1234567890;
        double d1 = 33.123456789012345;

        System.out.println("The double value of d is: "+d);
        System.out.println("The double value of d1 is: "+d1);

        /*
        7. char
        size: 2 bytes = 16 bits
         */

        char c = 'A';
        char c1 = '1';

        System.out.println("Character c is: "+c);
        System.out.println("Character c1 is: "+c1);

        /*
        8. boolean
        size:
         */

        boolean bl = true;
        boolean bl1 = false;

        System.out.println("Boolean bl value is: "+ bl);
        System.out.println("Boolean bl1 value is: "+bl1);

    }
}
