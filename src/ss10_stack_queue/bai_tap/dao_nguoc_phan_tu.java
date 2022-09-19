package ss10_DSA.bai_tap;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class dao_nguoc_phan_tu <T>{
    private final LinkedList<T>stack;
    public dao_nguoc_phan_tu() {
        stack=new LinkedList<>();
    }
    public int size() {
        return stack.size();
    }
    public void push(T num) {
        stack.addFirst(num);
    }
    public boolean isEmpty() {
        if (stack.size()==0) {
            return true;
        }
        return false;
    }
    public T pop() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }
        return stack.removeFirst();
    }
    void printf() {
        if (stack.size()==0) {
            System.out.println("empty");
        }else {
            for (int i=0;i<stack.size();i++) {
                System.out.println(stack.get(i));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        dao_nguoc_phan_tu<Integer>reverse=new dao_nguoc_phan_tu<>();
        System.out.println("Nhập vào số lượng mảng");
        int size=scanner.nextInt();
        for (int i=0;i<size;i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1)+":");
            int num =scanner.nextInt();
            reverse.push(num);
        }
        System.out.println("Phần tử đã nhập ");
        reverse.printf();
        int size1= reverse.size();
        dao_nguoc_phan_tu<Integer>reverse1=new dao_nguoc_phan_tu<>();
        for (int i=0;i<size1;i++) {
            reverse1.push(reverse1.pop());
        }
        System.out.println("mảng sau khi đảo");
        reverse1.printf();
    }
}
