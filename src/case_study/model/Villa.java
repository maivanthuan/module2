package case_study.model;

public class Villa extends Facility {
        private String tieuchuanphong;
        private double dientichhoboi;
        private int sotang;

    public Villa() {
    }

    public Villa(String tendinhvu, String dientichsudung, double chiphi, long songuoi, double kieuthue, String tieuchuanphong, double dientichhoboi, int sotang) {
        super(tendinhvu, dientichsudung, chiphi, songuoi, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.dientichhoboi = dientichhoboi;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public double getDientichhoboi() {
        return dientichhoboi;
    }

    public void setDientichhoboi(double dientichhoboi) {
        this.dientichhoboi = dientichhoboi;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    @Override
    public String toString() {
        return "villa{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", dientichhoboi=" + dientichhoboi +
                ", sotang=" + sotang +
                '}';
    }
}
