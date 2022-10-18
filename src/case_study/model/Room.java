package case_study.model;

public class Room extends Facility {
    private String dienvudikem;

    public Room() {
    }

    public Room(String tendinhvu, String dientichsudung, double chiphi, long songuoi, double kieuthue, String dienvudikem) {
        super(tendinhvu, dientichsudung, chiphi, songuoi, kieuthue);
        this.dienvudikem = dienvudikem;
    }

    public String getDienvudikem() {
        return dienvudikem;
    }

    public void setDienvudikem(String dienvudikem) {
        this.dienvudikem = dienvudikem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dienvudikem='" + dienvudikem + '\'' +
                '}';
    }
}
