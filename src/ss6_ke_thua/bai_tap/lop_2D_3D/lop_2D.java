package ss6_ke_thua.bai_tap.lop_2D_3D;

import java.awt.geom.Point2D;

public class lop_2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public lop_2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public lop_2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] test = new float[2];
        test[0] = this.x;
        test[1] = this.y;
        return test;
    }

    @Override
    public String toString() {
        return "lop_2D{" +
                "x=" + this.x +
                ", y=" + this.y +
                '}';
    }

    public static void main(String[] args) {
        lop_2D lop_2D=new lop_2D(2,3);
        System.out.println(lop_2D.toString());

    }
}
