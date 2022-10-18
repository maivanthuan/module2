package case_study.model;

public class House extends Facility {
    private String tieuchuanphong;
    private int sotang;

    public House() {
    }

    public House(String tendinhvu, String dientichsudung, double chiphi, long songuoi, double kieuthue, String tieuchuanphong, int sotang) {
        super(tendinhvu, dientichsudung, chiphi, songuoi, kieuthue);
        this.tieuchuanphong = tieuchuanphong;
        this.sotang = sotang;
    }

    public String getTieuchuanphong() {
        return tieuchuanphong;
    }

    public void setTieuchuanphong(String tieuchuanphong) {
        this.tieuchuanphong = tieuchuanphong;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuchuanphong='" + tieuchuanphong + '\'' +
                ", sotang=" + sotang +
                '}';
    }
}
