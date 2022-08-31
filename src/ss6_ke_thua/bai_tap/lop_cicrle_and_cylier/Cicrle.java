package ss6_ke_thua.bai_tap.lop_cicrle_and_cylier;

public class Cicrle {
     private double radius=5.0;
     private String color="red";

     public Cicrle() {
     }
     public Cicrle(double radius, String color) {
          this.radius=radius;
          this.color=color;
     }

     public double getRadius() {
          return radius;
     }

     public void setRadius(double radius) {
          this.radius = radius;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }
     public double getArea() {
          return this.radius*this.radius*Math.PI;
     }

     @Override
     public String toString() {
          return "Cicrle{" +
                  "radius=" + getRadius() +
                  ", color='" + getColor() + '\'' +
                  '}';
     }

     public static void main(String[] args) {
          Cicrle cicrle =new Cicrle();
          System.out.println(cicrle);
          cicrle=new Cicrle(3,"red");
          System.out.println(cicrle);
     }
}
