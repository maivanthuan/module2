package ss1_java.thuc_hanh;

import java.util.Scanner;

public class toan_tu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Nhập vào chiều dài: ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Diện tích hình chữ nhật là: " +area);
    }
}
