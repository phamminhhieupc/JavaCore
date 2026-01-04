package lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap luong: ");
        int n = sc.nextInt();
        if (n < 10) {
            System.out.println("khong can thue");
        } else if (n <= 15) {
            System.out.println("tien thue: " + n * 0.1);
        } else if (n <= 30) {
            System.out.println("tien thue: " + n * 0.2);
        } else {
            System.out.println("tien thue: " + n * 0.5);
        }
    }
}
