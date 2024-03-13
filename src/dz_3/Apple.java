package dz_3;

public class Apple {
    private int size;
    private String name;
    public Apple(int size,String name){
        this.size=size;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
