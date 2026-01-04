package lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println(">>Lua chon tinh nang<<");
        System.out.println("+-------+");
        System.out.println("1.cong");
        System.out.println("2.Tru");
        System.out.println("3.ket thuc");
        System.out.println("+-------+");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lua chon cua ban: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Lua chon cua ban la cong ");
                break;
            case 2:
                System.out.println("Lua chon cua ban la tru ");
                break;
            case 3:
                System.out.println("Lua chon cua ban ket thuc ");
                break;
        }
    }
}
