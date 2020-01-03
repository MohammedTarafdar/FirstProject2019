
package basic.java;

public class InstanceVariable {

    /*
    Each instance (object) of class has its own copy of instance variable, unlike static variable.
     */

    public static String myCollege = "Azizul Haque College, Bogura";
    String studentName = "Mohammed Ashikur Rahman Tarafdar";

    String collegeName = "City College, New York";

    public static void main(String [] args){

        InstanceVariable obj1 = new InstanceVariable();

        System.out.println("College Name is: "+myCollege);
        System.out.println("Student Name is: "+obj1.studentName);
        System.out.println("One of the best CUNY college is: "+obj1.collegeName);

        InstanceVariable obj2 = new InstanceVariable();
        InstanceVariable obj3 = new InstanceVariable();

        obj1.collegeName = "Hunter College, New york";

        System.out.println(" ");
        System.out.println("One of the best CUNY college is: "+obj1.collegeName);
        System.out.println("One of the best CUNY college is: "+obj2.collegeName);
        System.out.println("One of the best CUNY college is: "+obj3.collegeName);

        }





}


