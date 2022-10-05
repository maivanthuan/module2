package ss12_thuan_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class timchuoitanglonnhat {
    public static void main(String[] args) {
        LinkedList<Character>linkedList=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String str=scanner.nextLine();
        linkedList.add(str.charAt(0));
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)>linkedList.getLast()) {
                linkedList.add(str.charAt(i));
            }
        }
        for (Character character:linkedList) {
            System.out.println(character);
        }
    }
}
