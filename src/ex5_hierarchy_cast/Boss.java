package ex5_hierarchy_cast;

public class Boss extends Employee{

    public Boss(String name, String company) {
        super(name, company);
    }
    public void command(){
        System.out.println("РАБОТАЙТЕ!!!");
    }
}
