package ss10_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class chuyen_doi_danh_nhi_phan {
    public static void chuyendoi(int num) {
        Stack<Integer>stack=new Stack<>();
        while (num>0) {
            int temp=num%2;
            stack.push(temp);
            num/=2;
        }
        final int size=stack.size();
        for (int i=0;i<size;i++) {
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("\nNhập số cần chuyển đổi: ");
            int num=scanner.nextInt();
            chuyendoi(num);
        }while (true);
    }
}
