package ss1_java.thuc_hanh;

import java.util.Scanner;

public class ham_bac_hai {
    public static void main(String[] args) {
        System.out.println("Giải hàm bậ 2");
        System.out.println("Hàm có dạng: a*x+b*y=c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}