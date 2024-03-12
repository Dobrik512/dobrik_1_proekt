package ex6_interfaces;

public interface MultiInheritance {
}

interface Printable {

    // методы интерфейса
}

interface Searchable {

    // методы интерфейса
}

class Book implements Printable, Searchable{

    // реализация класса
}

interface BookPrintable extends Printable{

    void paint();
}
