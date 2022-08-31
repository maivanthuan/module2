package ss6_ke_thua.bai_tap.lop_cicrle_and_cylier;

import com.sun.org.apache.xpath.internal.axes.MatchPatternIterator;

public class cylier extends Cicrle{
    public double height=10.0;
    public cylier() {
    }
    private cylier(double radius, String color, double height ) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI*super.getRadius()*getRadius()*getHeight();
    }

    @Override
    public double getArea() {
        return super.getArea()*2+2* Math.PI*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "Color:"+getColor()+"\nRadius:"+getRadius()+"\nArea:"+getArea()+"\nvolume:"+getVolume();
    }

    public static void main(String[] args) {
        cylier Cylier= new cylier();
        System.out.println(Cylier);
        Cylier =new cylier(3,"blue",10);
        System.out.println(Cylier);
    }
}

