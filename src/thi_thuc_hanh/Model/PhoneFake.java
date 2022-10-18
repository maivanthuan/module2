package thi_thuc_hanh.Model;

import java.util.Scanner;

public class PhoneFake extends Phone{
    private String quocgiaxachtay;
    private String trangthai;
    public PhoneFake() {
    }
    public PhoneFake(int id, String tensanpham, double gia, int soluong, String nhasanxuat, String quocgiaxachtay, String trangthai) {
        super(id, tensanpham, gia, soluong, nhasanxuat);
        this.quocgiaxachtay=quocgiaxachtay;
        this.trangthai=trangthai;
    }

    public String getQuocgiaxachtay() {
        return quocgiaxachtay;
    }

    public void setQuocgiaxachtay(String quocgiaxachtay) {
        this.quocgiaxachtay = quocgiaxachtay;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "PhoneFake{" +
                "ID=" + getId() +
                ", tên điện thoại='" +getTensanpham() + '\'' +
                ", giá=" +getGia() +
                ", số lượng=" + getSoluong() +
                ", nhà sản xuất='" + getNhasanxuat() + '\'' +
                ", quốc gia xách tay='" + getQuocgiaxachtay() + '\'' +
                ", trạng thái='" + getTrangthai() + '\'' +
                '}';
    }

    public void infoPhoneFake(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao quoc gia xach tay: ");
        this.quocgiaxachtay=scanner.nextLine();
        System.out.println("Nhap vao trang thai: ");
        this.trangthai=scanner.nextLine();


}
}
