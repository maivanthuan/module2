package ss10_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        TreeMap<String,Integer> map =new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhâp 1 chuỗi");
        String str= scanner.nextLine();
        String[] arr=str.split("");
        System.out.println("Mảng sau khi nhập: "+ Arrays.toString(arr));
        for (String s:arr) {
            if (map.containsKey(s)) {
                int count=map.get(s);
                count++;
                map.put(s,count);
            }else {
                map.put(s,1);

            }
        }
        System.out.println(map);
    }
}
