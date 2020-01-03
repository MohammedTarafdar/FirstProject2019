package basic.java;

public class DataTypes {

    public static void main(String[] args) {

        /*
        There are 8 types of primitive data supported by java
        1. byte
        size: 1 byte = 8 bits
        range: -128 to 127
         */
        byte b = 10;
        System.out.println("Value of b is: "+b);
        b = 20;
        System.out.println("New value of b is: "+b);

        byte b1 = 127;
        byte b2 = -127;

        System.out.println(" ");
        System.out.println("Byte can hold maximum value of b1 is: "+b1);
        System.out.println("Byte can hold minimum number of b2 is: "+b2);

        /*
        2. short
        size: 2 bytes = 16 bits
        range:-32768 to 32767
         */
        short s = 32767;
        short s1 = -32768;

        System.out.println(" ");
        System.out.println("short can hold maximum value of s is: "+s);
        System.out.println("short can hold minimum number of s1 is: "+s1);

        /*
        3. int
        size: 4 bytes = 32 bits
        range:
         */

        int i = 2147483647;
        int i1 = -2147483648;

        System.out.println("The maximum value of int can be: "+i);
        System.out.println("The minimum value of int can be: "+i1);

        /*
        4. long
        size: 8 bytes = 64 bits
        range:
         */
        long l = 1234567890123456789l;

        System.out.println("Long can hold really large number of value:"+l);

        /*
        5. float
        size: 4 byte = 32 bits
        range:
         */

        float f = 12.5f;
        float f1= (float)12.5;
        float f2= 100;

        System.out.println("The float data type is used for single-precision value like f:"+f);
        System.out.println("float can be declared before the value like f is: "+f1);
        System.out.println("float can holds whole number like f2: "+f2);

        /*
        6. double
        size: 8 bytes = 64 bits
        range
         */

        double d = 123.25;
        double num1 = 10;
        double num2 = 3;
        double result = num1/num2;

        System.out.println("The value of d is: "+d);
        System.out.println("The value of d is: "+num1);
        System.out.println("The value of d is: "+num2);
        System.out.println("The value of d is: "+result);

        /*
        7. char
        size: 2 bytes = 16 bits
         */

        char c = 'A';
        char c1 = '1';
        char c2 = '$';

        System.out.println("The value of c is: "+c);
        System.out.println("The value of c1 is: "+c1);
        System.out.println("The value of c2 is: "+c2);

        /*
        8. boolean
        size: ~1 bit
         */

        boolean bl = true;
        boolean bl1 = false;

        System.out.println(bl);
        System.out.println(bl1);

        /*
        9. String is non-primitive data type
        size:
         */

        String str = "Hello World";

        System.out.println(str);





    }
}
