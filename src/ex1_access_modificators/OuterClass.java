package ex1_access_modificators;

import ex1_access_modificators.inner.Person;

public class OuterClass {
    public static void main(String[] args) {
        Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        System.out.println(kate.address);
    }
}