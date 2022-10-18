package case_study.model;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String tendinhvu;
    private String dientichsudung;
    private double chiphi;
    private long songuoi;
    private double kieuthue;
    public Facility() {
    }
    public Facility(String tendinhvu, String dientichsudung, double chiphi, long songuoi, double kieuthue) {
        this.tendinhvu = tendinhvu;
        this.dientichsudung = dientichsudung;
        this.chiphi = chiphi;
        this.songuoi = songuoi;
        this.kieuthue = kieuthue;
    }

    public String getTendinhvu() {
        return tendinhvu;
    }

    public void setTendinhvu(String tendinhvu) {
        this.tendinhvu = tendinhvu;
    }

    public String getDientichsudung() {
        return dientichsudung;
    }

    public void setDientichsudung(String dientichsudung) {
        this.dientichsudung = dientichsudung;
    }

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }

    public long getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(long songuoi) {
        this.songuoi = songuoi;
    }

    public double getKieuthue() {
        return kieuthue;
    }

    public void setKieuthue(double kieuthue) {
        this.kieuthue = kieuthue;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "tendinhvu='" + tendinhvu + '\'' +
                ", dientichsudung='" + dientichsudung + '\'' +
                ", chiphi=" + chiphi +
                ", songuoi=" + songuoi +
                ", kieuthue=" + kieuthue +
                '}';
    }
}
