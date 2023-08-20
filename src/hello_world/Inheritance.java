package hello_world;

public class Inheritance {

    Inheritance() {
        System.out.println("I am Inheritance class method");
    }

    Inheritance(int x) {
        System.out.println("I am Inheritance class method two with parameter " + x);
    }

   static  class InheritanceChild extends Inheritance {

        InheritanceChild() {
            super(); // Call the parameterless constructor of the superclass
            System.out.println("I am InheritanceChild class method");
        }

        InheritanceChild(int x) {
        	
        	super(x);
        
            System.out.println("I am InheritanceChild class method two with parameter " + x);
        }
    }

    public static void main(String[] args) {
        InheritanceChild myObj = new InheritanceChild(5);
    }
}
