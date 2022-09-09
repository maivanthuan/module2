package ss7_abstract.bai_tap.Resizeable;

public class main {
    public static void main(String[] args) {
        Circle[] circle=new Circle[2];
        circle[0]=new Circle(2);
        circle[1]=new Circle(3);
        System.out.println("\nKích thước hình tròn khi chưa thay đổi: ");
        for (Circle circle1:circle) {
            System.out.println(circle1);
        }
        System.out.println("\nsau khi thay đổi: ");
        for (Circle circle2:circle)  {
            double percent=Math.random();
            circle2.resize(percent);
            System.out.println(circle2);
        }
        Rectangle[] rectangles=new Rectangle[2];
        rectangles[0]=new Rectangle(11,5);
        rectangles[1]=new Rectangle(21,10);
        System.out.println("\nHình chữ nhật khi chưa thay đổi: ");
        for (Rectangle rectangle:rectangles) {
            System.out.println(rectangle);
        }
        System.out.println("\nHình chữ nhật khi đã thay đổi: ");
        for (Rectangle rectangle1:rectangles) {
            double percent=Math.random();
            rectangle1.resize(percent);
            System.out.println(rectangle1);
        }
    }
}
