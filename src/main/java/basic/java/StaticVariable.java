package basic.java;

public class StaticVariable {

    /*
    Static variable are also Known as class variable because they are associated with the class and common for all
    the instances of class.
     */

    public static String collegeName = "City College, New York";


    public static void main(String[] args) {

        System.out.println("One of best college of NYC is: "+collegeName);

        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        System.out.println(" ");
        System.out.println(obj1.collegeName);
        System.out.println(obj2.collegeName);
        System.out.println(obj3.collegeName);

        obj2.collegeName = "Baruch College, New York";

        System.out.println(" ");
        System.out.println(obj1.collegeName);
        System.out.println(obj2.collegeName);
        System.out.println(obj3.collegeName);

    }
}
