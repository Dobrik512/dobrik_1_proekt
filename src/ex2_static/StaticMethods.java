package ex2_static;

public class StaticMethods {
    public static void main(String[] args) {

        PersonWithStaticMethod.displayCounter();    // Counter: 1

        PersonWithStaticMethod tom = new PersonWithStaticMethod();
        PersonWithStaticMethod bob = new PersonWithStaticMethod();

        PersonWithStaticMethod.displayCounter();    // Counter: 3
    }
}

class PersonWithStaticMethod {

    private int id;
    private static int counter = 1;

    PersonWithStaticMethod() {
        id = counter++;
    }

    // статический метод
    public static void displayCounter() {

        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId() {

        System.out.printf("Id: %d \n", id);
    }

}
