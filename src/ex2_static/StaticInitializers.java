package ex2_static;

public class StaticInitializers {
    public static void main(String[] args) {

        PersonWithInitializer tom = new PersonWithInitializer();
        PersonWithInitializer bob = new PersonWithInitializer();

        tom.displayId();    // Id = 105
        bob.displayId();    // Id = 106
    }
}

class PersonWithInitializer {

    private int id;
    static int counter;
    static String string = "";
    static String string1;

//    static {
//        counter = 105;
//        System.out.println("Static initializer");
//    }

    PersonWithInitializer() {
        id = counter++;
        System.out.println("Constructor");
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }
}
