package ss12_thuan_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class chuoicododainhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str;
        System.out.println("Nhập vào chuỗi");
         str=scanner.nextLine();
        LinkedList<Character>list=new LinkedList<>();
        list.add(str.charAt(0));
        for (int i=1;i<str.length();i++) {
            if (str.charAt(i)>list.getLast()) {
                list.add(str.charAt(i));
            }
        }
        for (Character character:list) {
            System.out.println(character);
        }
    }
}
