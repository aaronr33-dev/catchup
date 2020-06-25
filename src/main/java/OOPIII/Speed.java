package OOPIII;

/* Enums are types that have fixed value

    This file will be used to demonstrate the use of enums and enum constructor and enum strings

 */

// Declaring enums
enum Speed {

    Slow("I am slow"),
    Average("I am average speed"),
    Fast("I am fast"),
    VeryFast("I am very fast");


    private final String quickness;

    // private enum constructor
    Speed(String quickness) {
        this.quickness = quickness;
    }


    public String howFast(){
        return quickness;
    }
}

class MainEnum {

    public static void main(String[] args) {

        //Speed sonic = new Speed.Slow;
        //System.out.println(sonic.howFast());
    }

}