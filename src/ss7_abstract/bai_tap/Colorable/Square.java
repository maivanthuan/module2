package ss7_abstract.bai_tap.Colorable;

public class Square implements Colorable{
    private double ga;
    Square(double ga) {
        this.ga=ga;
    }

    public double getGa() {
        return ga;
    }
    public double Area() {
        return ga*ga;
    }

    @Override
    public String toString() {
        return "Cánh gà: "+ga+" Area: "+Area();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side.");
    }
}
