package ex6_interfaces;

public interface Flyable {
    void fly();

    default void stand(){
        System.out.println("Stand here!");
    }

    static void read(){
        System.out.println("Read printable");
    }
}
