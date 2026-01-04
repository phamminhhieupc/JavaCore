package lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            System.out.println("Phuong trinh co nghiem: " + -b / a);
        }
    }
}
