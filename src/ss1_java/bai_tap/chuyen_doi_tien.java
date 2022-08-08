package ss1_java.bai_tap;

import java.util.Scanner;

public class chuyen_doi_tien {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền USD muốn đổi: ");
        int USD= scanner.nextInt();
        int VIETNAM = USD*23000;
        System.out.println("Đổi ra tiền việt là: " +VIETNAM);

    }
}
