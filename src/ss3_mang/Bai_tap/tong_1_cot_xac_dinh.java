package ss3_mang.Bai_tap;

import java.util.Scanner;

public class tong_1_cot_xac_dinh {
    public static void main(String[] args) {
        int[][] array= {
                {1,5,6,3,7,2},
                {7,9,4,12,3,16},
                {15,21,43,12,5,7}
        };
        System.out.print("Mảng 2 chiều là: "+"\n");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.print("\n");
        }
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập cột muốn tính: ");
        int number= scanner.nextInt();
        if (number>array[0].length) {
            System.out.println("Nhập lại");
        }else {
            int total=0;
            for (int i=0;i<array.length;i++) {
                total= total + array[i][number-1];
        }
            System.out.println("Tổng các phần cột "+ number+ " là: "+total);
        }
    }
}
