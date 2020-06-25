package OOPIII;

// This class is about SIngletons which seem stupid

class Singleton {

    private static Singleton single;

    public Singleton(){}

    public static Singleton getInstance(){
        return single;
    }

    public void status(){
        System.out.println("If you are not in a relationship then you are a singleton");
    }
}

class MainTest {
    public static void main(String[] args) {
        Singleton single = new Singleton();
        single.status();

    }
}
