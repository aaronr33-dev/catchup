package OOP;

public class Vehicle {
    // Fields
    private String color;
    private String manufacturer;
    private String model;
    private int wheels;

    // Constructor
    public Vehicle(String color, String manufacturer, String model, int wheels) {
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    // Getter and Setter

    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Creation of two string method that prints the variables assigned to the Vehicle object
    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public void isBraking(){
        System.out.println("The " + color + " " + manufacturer + " " + model + " is braking");
    }

    public void isAccelerating(){
        System.out.println("The " + color + " " + manufacturer + " " + model + " is acclerating");
    }


}
