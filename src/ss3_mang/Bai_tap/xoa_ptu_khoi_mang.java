package ss3_mang.Bai_tap;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xoa_ptu_khoi_mang {
    public static void main(String[] args) {
        int[] arrray={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Mảng hiện có những số: ");
        for (int i =0;i<arrray.length;i++) {
            System.out.print(arrray[i]+",");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("\n"+"Nhập số cần xóa khỏi mảng: ");
        int x =scanner.nextInt();
        System.out.println("Mảng sau khi xóa: ");
        for (int i=0;i<arrray.length;i++) {
            if (x==arrray[i]) {
                for (int j =i;j<arrray.length-1;j++) {
                    arrray[j]=arrray[j+1];
                }
            }
        }
        for (int i =0;i<arrray.length-1;i++) {
            System.out.print(arrray[i]+",");
        }
    }
}
