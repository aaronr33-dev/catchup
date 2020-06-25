package OOPII;

// This file is a demonstration of using interfaces

interface Polygon {
    public void getArea(int length, int width);
    public void getDimensions(int length, int width);
    public void getVertices(int sides);
    default void shape(){
        System.out.println("I am shape");
    }
}

class Pentagon implements Polygon {

    @Override
    public void getArea(int length, int width) {
        System.out.println("Area is " + (length * width) + " square feet");
    }

    @Override
    public void getDimensions(int length, int width) {
        System.out.println("Dimensions are " + length + " feet by " + width + " feet " );
    }

    @Override
    public void getVertices(int sides) {
        System.out.println("This polygon has " + sides + " vertices/sides");
    }

    public void shape(){
        System.out.println("I am a shape with sharp edges.");
    }
}

class Main {
    public static void main(String[] args) {
        Pentagon pent = new Pentagon();
        pent.getArea(5, 6);
        pent.getDimensions(10, 12);
        pent.getVertices(5);
        pent.shape();
    }
}