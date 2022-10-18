package thi_thuc_hanh.Model;

public class PhoneReal extends Phone{
    private String thoigianbaohanh;
    private String phamvibaohanh;
    public  PhoneReal() {
    }

    public PhoneReal(int id, String tensanpham, double gia, int soluong, String nhasanxuat, String thoigianbaohanh, String phamvibaohanh) {
        super(id, tensanpham, gia, soluong, nhasanxuat);
        this.thoigianbaohanh=thoigianbaohanh;
        this.phamvibaohanh=phamvibaohanh;
    }

    public String getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(String thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    public String getPhamvibaohanh() {
        return phamvibaohanh;
    }

    public void setPhamvibaohanh(String phamvibaohanh) {
        this.phamvibaohanh = phamvibaohanh;
    }

    @Override
    public String toString() {
        return "Phone_real{" +
                "ID=" + getId() +
                ", tên điện thoại='" +getTensanpham() + '\'' +
                ", giá=" +getGia() +
                ", số lượng=" + getSoluong() +
                ", nhà sản xuất='" + getNhasanxuat() + '\'' +
                ", quốc gia xách tay='" + getThoigianbaohanh() + '\'' +
                ", trạng thái='" + getPhamvibaohanh() + '\'' +
                '}';
    }
}
