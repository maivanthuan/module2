package ss3_mang.Bai_tap;

public class tim_so_be_nhat {
    public static void main(String[] args) {
        int [][] array= {
                {49,2,3,4,5,9},
                {32,13,21,1,12,14},
                { 75,43,25,61,28,83}
        };
        System.out.println("Mảng 2 chiều là: ");
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.print("\n");
        }
        int min= array[0][0];
        for (int i =0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (array[i][j]<min) {
                    min=array[i][j];
                }
            }
        }
        System.out.println("Số bé nhất là: " + min);
    }

}