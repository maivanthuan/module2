package bai_tap_ngoai_2.model;

public class MotoBike extends Transport{
    private long CongSuat;
    public MotoBike() {
    }

    public MotoBike(String BienKiemSoat, String TenHangSanXuat, long NamsanXuat, String ChuSoHuu, long congSuat) {
        super(BienKiemSoat, TenHangSanXuat, NamsanXuat, ChuSoHuu);
        CongSuat = congSuat;
    }

    public long getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(long congSuat) {
        CongSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "BienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", TenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", NamsanXuat=" + getNamsanXuat() +
                ", ChuSoHuu='" + getChuSoHuu() + '\'' +
                "CongSuat=" + CongSuat +
                '}';
    }
}
