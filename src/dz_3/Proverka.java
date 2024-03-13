package dz_3;

public class Proverka {
    public static void main(String[] args) {
        Object[] objects={new Apple(1,"поздний"),new Orange(5,"спелый")};
        for (int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);
        }
    }
}
