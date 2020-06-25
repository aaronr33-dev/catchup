package OOPII;

// This ia an abstract class; Cannot be instantiated
abstract  class Organism {

    // Eat method
    public void eat(){
        System.out.println("I eat when I am hungry");
    }
    // Sleep method
    public void sleep() {
        System.out.println("I sleep when I am tired");
    }
    // Speak method
    public void speak(){
        System.out.println("I speak words");
    }

    //abstract method
    abstract void move();


}
