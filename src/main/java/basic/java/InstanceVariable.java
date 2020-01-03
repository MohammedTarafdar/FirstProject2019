package basic.java;

public class InstanceVariable {
    /*
    Each instance (object) of class has its own copy of instance variable, unlike static variable.
     */

    public static String myCollege = "Azizul Haque College, Bogura";
    String studentName = "Mohammed Ashikur Rahman Tarafdar";

    public static void main(String [] args){

        InstanceVariable obj1 = new InstanceVariable();
        System.out.println("College Name is: "+myCollege);
        System.out.println("Student Name is: "+obj1.studentName);
    }
}
