package ex3_objects_like_parameters;

public class Program1 {
    public static void main(String[] args) {

        Person1 kate = new Person1("Kate");
        System.out.println(kate.getName());     // Kate
        changeName(kate);
        System.out.println(kate.getName());     // Alice
    }

    static void changeName(Person1 p) {
        p.setName("Alice");
    }
}

class Person1 {

    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }
}
