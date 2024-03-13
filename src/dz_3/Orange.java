package dz_3;

public class Orange {
    private int ves;
    private String name;
    public Orange(int ves,String name){
        this.ves=ves;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "ves=" + ves +
                ", name='" + name + '\'' +
                '}';
    }
}
