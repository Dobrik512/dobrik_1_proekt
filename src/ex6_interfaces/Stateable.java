package ex6_interfaces;

public interface Stateable {
    public static final int OPEN = 1;
    public static final int CLOSED = 0;

    void printState(int n);
}
