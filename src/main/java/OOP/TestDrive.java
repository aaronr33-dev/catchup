package OOP;

public class TestDrive {

    public static void main(String[] args) {

        // Creating two Vehicle objects
        Vehicle vic1 = new Vehicle("blue", "Honda","Accord", 4);
        Vehicle vic2 = new Vehicle("silver", "Ford", "Explorer", 4);

        // creating Sedan object
        Sedan sed1 = new Sedan("burgandy", "Toyota", "Camry", 4);

        // prints object in toString format
        System.out.println(vic1);

        // prints what Vehicle 1 is doing
        vic1.isBraking();

        // Prints what Vehicle 2 is doing
        vic2.isAccelerating();

        // Calls the method to say if the vehicle is front wheel drive or not
        sed1.frontWheel();

    }
}
