package ss7_abstract.bai_tap.Resizeable;

public class Circle implements Resizeable{
    private double raduis;
        Circle( double raduis) {
            this.raduis=raduis;
        }

    public double getRaduis() {
        return raduis;
    }
    public double Area() {
            return raduis*raduis*Math.PI;
    }

    @Override
    public String toString() {
        return "Radius: "+getRaduis()+"\n+Area: "+Area();
    }

    @Override
    public void resize(double percent) {
        raduis=raduis*raduis*percent;

    }
}
