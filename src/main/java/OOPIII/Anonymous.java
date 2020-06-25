package OOPIII;

/* A nested class that doesn't have any name is known as an anonymous class.
 An anonymous class must be defined inside another class.
 Hence, it is also known as an anonymous inner class.

 Anonymous classes usually extend subclasses or implement interfaces.

 class outerClass {

    // defining anonymous class
    object1 = new Type(parameterList) {
         // body of the anonymous class
    };
}

Here, Type can be
a superclass that an anonymous class extends
an interface that an anonymous class implements

 */

class Arbitrary {
    public void display() {
        System.out.println("I'm random information");
    }
}

class Anonymous {
    public void createClass() {

        // creation of anonymous class extending class Arbitrary
        Arbitrary a1 = new Arbitrary() {
            public void display() {
                System.out.println("Inside an anonymous class. ");
            }
        };
        a1.display();
    }
}

class Main {
    public static void main(String[] args) {
        Anonymous an = new Anonymous();
        an.createClass();
    }
}




