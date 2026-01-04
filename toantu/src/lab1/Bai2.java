package lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nubber one: ");
        int n = sc.nextInt();
        System.out.println("nubber two: ");
        int m = sc.nextInt();
        System.out.println("Chu vi cua hcn: " + (n + m) * 2);
        System.out.println("Dien tich cua hcn: " + n * m);
        System.out.println("So lon nhat trong 2 so: " + Math.max(n, m));
    }
}
