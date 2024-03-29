package ex5_hierarchy_cast;

class Client extends Person {

    private int sum; // Переменная для хранения суммы на счете
    private String bank;

    public Client(String name, String bank, int sum) {

        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    public void display() {

        System.out.printf("Client %s has account in %s \n and sum of %s", super.getName(), bank, sum);
    }

    public String getBank() {
        return bank;
    }

    public int getSum() {
        return sum;
    }
}
