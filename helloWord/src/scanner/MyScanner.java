package scanner;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        String s = sc.nextLine();
        System.out.println("nhap diem:");
        int a = sc.nextInt();
        System.out.println(s + " co diem " + a);

    }
}

