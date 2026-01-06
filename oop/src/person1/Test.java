package person1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<Person> obj = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            String firstName = in.next();
            String lastName = in.next();
            String email = in.next();
            int age = in.nextInt();
            in.nextLine();
            Person person = new Person(firstName, lastName, email, age);
            obj.add(person);
        }
        for (Person person : obj) {
            System.out.println(person);
        }
        in.close();

    }
}