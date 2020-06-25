package OOPIII;

// This file is used to demonstrte the working of normal nested/inner and outer classes

class InOutClass {

    private int num;
    private int age;

    public InOutClass(int num, int age) {
        this.num = num;
        this.age = age;
    }


    class Calc{
        public void multiply(int num, int age){
            System.out.println("The result is " + (num * age));
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        InOutClass exam = new InOutClass(5, 12);
        InOutClass.Calc demo = exam.new Calc();
        demo.multiply(5,12);
    }
}

/*  !! Only nested classes can be static !!

    A static inner class is similiar to this exmaple.
    In the main method, instead of creating the "demo" in twi lines, it could be done in one line.

    The Calc class would have to be changed to static.
    The main method object creation would be :
       "   InOutClass.Calc demo = InOutClass.Calc();   "
      It references both classes and creates the object with the name  'demo'
 */