package lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        int b = (int) Math.sqrt(a);
        boolean c = true;
        if (a < 2) {
            c = false;
        } else {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0) {
                    c = false;
                    break;
                }

            }
        }
        if (c) {
            System.out.println("a la so nguyen to");
        } else {
            System.out.println("a khong phai so nguyen to");
        }

    }
}
