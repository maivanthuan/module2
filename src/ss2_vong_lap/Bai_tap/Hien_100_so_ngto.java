package ss2_vong_lap.Bai_tap;

import java.util.Scanner;

public class Hien_100_so_ngto {
    public static void main(String[] args) {
       for (int i=2;i<=100;i++) {
           int dem = 0;
           for (int j = 2; j <=Math.sqrt(i); j++) {
               if (i % j == 0) {
                   dem++;
               }
           }
           if (dem==0) {
               System.out.println(i+"\t");
           }
       }
    }
}
