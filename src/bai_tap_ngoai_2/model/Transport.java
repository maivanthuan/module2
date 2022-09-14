package bai_tap_ngoai_2.model;

public class Transport {
    private String BienKiemSoat;
    private String TenHangSanXuat;
    private long NamsanXuat;
    private String ChuSoHuu;
    public Transport() {
    }
    public Transport(String BienKiemSoat, String TenHangSanXuat, long NamsanXuat, String ChuSoHuu) {
        this.BienKiemSoat=BienKiemSoat;
        this.TenHangSanXuat=TenHangSanXuat;
        this.NamsanXuat=NamsanXuat;
        this.ChuSoHuu=ChuSoHuu;
    }

    public String getBienKiemSoat() {
        return BienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        BienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return TenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        TenHangSanXuat = tenHangSanXuat;
    }

    public long getNamsanXuat() {
        return NamsanXuat;
    }

    public void setNamsanXuat(long namsanXuat) {
        NamsanXuat = namsanXuat;
    }

    public String getChuSoHuu() {
        return ChuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        ChuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "BienKiemSoat='" + BienKiemSoat + '\'' +
                ", TenHangSanXuat='" + TenHangSanXuat + '\'' +
                ", NamsanXuat=" + NamsanXuat +
                ", ChuSoHuu='" + ChuSoHuu + '\'' +
                '}';
    }

}
