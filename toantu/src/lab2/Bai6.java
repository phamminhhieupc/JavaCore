package lab2;

import java.util.Scanner;
import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("nhap phan tu thu: " + i);
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(n[9]);
        System.out.println(n[0]);
    }
}
