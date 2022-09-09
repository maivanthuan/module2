package ss7_abstract.bai_tap.Resizeable;

public class Rectangle implements Resizeable{
        private double height;
        private  double width;
        Rectangle(double height, double width) {
            this.height=height;
            this.width=width;
        }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    public double Area() {
       return height*width;
    }

    @Override
    public String toString() {
        return "Height: "+height+"\nWidth: "+width+"\nArea: "+Area();
    }

    @Override
    public void resize(double percent) {
        height=height*height*percent;
        width=width*width*percent;
    }
}
