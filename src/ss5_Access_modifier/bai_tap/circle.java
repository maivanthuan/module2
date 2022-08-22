package ss5_Access_modifier.bai_tap;

public class circle {
    private double radius=1.0;
    private String color="red";
    private circle() {
    }
    private circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius*radius;
    }

    public static void main(String[] args) {
        circle Circle=new circle(10.5);
        double r= Circle.getRadius();
        double a=Circle.getArea();
        System.out.println("Radius: "+r);
        System.out.println("Area: "+a);
    }
}
