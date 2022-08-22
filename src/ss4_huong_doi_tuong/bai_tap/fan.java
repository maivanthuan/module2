package ss4_huong_doi_tuong.bai_tap;

public class fan {
    private static final int SLOW=1;
    private static final int MEDIUM=2;
    private static final int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public fan(int speed, boolean on, double radius, String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    public String toString()  {
        String infor="";
        if (this.on) {
            infor+= "Speed: "+this.speed+" radius: "+this.radius+" color: "+this.color+"\n Fan đang bật";
        }else {
            infor+="Color: "+this.color+" radius: "+this.radius+"\n fan đang tắt";
        }
        return infor;
    }

    public static void main(String[] args) {
        fan Fan1=new fan(3,true,15,"yellow");
        fan Fan2=new fan(1,false,5,"Blue");
        System.out.println("Fan 1: "+Fan1.toString());
        System.out.println("Fan 2: "+Fan2.toString());
    }
}

