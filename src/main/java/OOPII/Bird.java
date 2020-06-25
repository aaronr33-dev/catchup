package OOPII;

public class Bird extends Organism {

    public void wings(){
        System.out.println("I have wings and I can fly");
    }

    @Override
    public void speak(){
        super.speak();
        System.out.println("I dont speak Spanish but I chirp");
    }

    @Override
    public void move(){
        System.out.println("I move  by flying");
    }
}

class Bacteria extends Organism {

    @Override
    public void move(){
        System.out.println("I move by swimming, or by however bacteria move. I'm not a biologist");
    }
}
