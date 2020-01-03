package basic.java;

public class InstanceVariable {

    String collegeName = "City College, New York";

    public static void main(String [] args){
        InstanceVariable obj1 = new InstanceVariable();
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
