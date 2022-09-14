package bai_tap_ngoai_2.model;



public class Truck extends Transport{
    private double TrongTai;

    public Truck() {
    }

    public Truck(String BienKiemSoat, String TenHangSanXuat, long NamsanXuat, String ChuSoHuu, double trongTai) {
        super(BienKiemSoat, TenHangSanXuat, NamsanXuat, ChuSoHuu);
        TrongTai = trongTai;
    }

    public double getTrongTai() {
        return TrongTai;
    }

    public void setTrongTai(double trongTai) {
        TrongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "BienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", TenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", NamsanXuat=" + getNamsanXuat() +
                ", ChuSoHuu='" + getChuSoHuu() + '\'' +
                "TrongTai=" + TrongTai +
                '}';
    }
}
