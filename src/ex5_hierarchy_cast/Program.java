package ex5_hierarchy_cast;
public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();

//        Object tom = new Person("Tom");
//        Object sam = new Employee("Sam", "Oracle");
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        Person alice = new Employee("Alice", "Google");

//        Object sam = new Employee("Sam", "Oracle");
//// нисходящее преобразование от Object к типу Employee
//        Employee emp = (Employee)sam;
//        emp.display();
//        System.out.println(emp.getCompany());

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        ((Person)kate).display();
//        Object sam = new Employee("Sam", "Oracle");
//        ((Employee)sam).display();

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        Employee emp = (Employee) kate;
//        emp.display();
//// или так
//        ((Employee)kate).display();

/*
        Оператор instanceof
 */
//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Employee){
//            Employee employeeKate = (Employee) kate;
//            employeeKate.display();
//        }
//        else{
//            System.out.println("Conversion is invalid");
//        }

//        Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Client){
//            Client clientKate = (Client) kate;
//            clientKate.display();
//        }
//        else{
//            System.out.println("Conversion is invalid");
//        }

    }
}