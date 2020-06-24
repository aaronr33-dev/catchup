package OOP;

/* This class is demonstrating inheritacne which define an  " is a" relationship.
 For example, a sedan is a vehicle. In this case. The Sedan object/class inherits
 all of the properties from the Vehicle class.
 */
public class Sedan extends Vehicle {

    // creating a new instance variable
    private Boolean drive;

    // constructor that inherits the field from the Vehicle class using the "super" keyword
    public Sedan(String color, String manufacturer, String model, int wheels) {
        super(color, manufacturer, model, wheels);
        this.drive = drive;
    }

    // Getter and Setter Method for the the drive field
    public Boolean getDrive() {
        return drive;
    }
    public void setDrive(Boolean drive) {
        this.drive = drive;
    }

    public void frontWheel(){
        drive = true;
        System.out.println("Vehicle is front wheel drive: "+ drive);
    }

    public void rearWheel(){
        drive = false;
        System.out.println("Vehicle is rear wheel drive: " + drive);
    }


}
