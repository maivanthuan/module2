package bai_tap_ngoai_2.model;

public class Car extends Transport{
    private int SoChoNgoi;
    public String KieuXe;
    public Car() {
    }

    public Car(String BienKiemSoat, String TenHangSanXuat, long NamsanXuat, String ChuSoHuu, int soChoNgoi, String kieuXe) {
        super(BienKiemSoat, TenHangSanXuat, NamsanXuat, ChuSoHuu);
        SoChoNgoi = soChoNgoi;
        KieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return SoChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        SoChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return KieuXe;
    }

    public void setKieuXe(String kieuXe) {
        KieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "BienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", TenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", NamsanXuat=" + getNamsanXuat() +
                ", ChuSoHuu='" + getChuSoHuu() + '\'' +
                ", SoChoNgoi='"+SoChoNgoi+'\''+
                ", KieuXe='"+KieuXe+'\''+
                '}';
    }

}
