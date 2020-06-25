package OOPII;

public class TestLife {

    public static void main(String[] args) {
        Bird birdy = new Bird();
        Bacteria bac1 = new Bacteria();

        System.out.println("Bird's Action");
        birdy.wings();
        birdy.speak();
        birdy.move();

        System.out.println("\nBacteria's Actions");
        bac1.move();

        /* There is an example or polymorphism displayed through the
        Bacteria object and Bird object sharing the same method.

        Polymorphism can also be displayed by overloaded methods

        Examples of encapsulation were shown through the use of getter and setter methods.

         */

    }
}
