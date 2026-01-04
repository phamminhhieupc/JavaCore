//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        int a = sc.nextInt();
        System.out.println("nhap b:");
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("ket qua bang:" + c);
        System.out.printf("ket qua bang: %d", c);
    }
}