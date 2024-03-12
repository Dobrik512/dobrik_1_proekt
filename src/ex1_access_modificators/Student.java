package ex1_access_modificators;

public class Student {
    private int age;
    private byte[] marks;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte[] getMarks() {
        return marks;
    }

    public void setMarks(byte[] marks) {
        this.marks = marks;
    }
}
