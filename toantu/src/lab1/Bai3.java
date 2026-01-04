package lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh hinh lap phuong: ");
        int n = sc.nextInt();
        System.out.println("The tich hinh lap phuong: " + Math.pow(n, 3));
    }
}
