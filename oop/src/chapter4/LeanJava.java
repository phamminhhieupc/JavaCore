package chapter4;

public class LeanJava {
    public static void main(String[] args) {
        Student st1 = new Student("hieu", 20);
        st1.setAge(30);
        
        System.out.println(st1.getName() + " " + st1.getAge());
    }
}
