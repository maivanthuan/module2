package ss6_ke_thua.bai_tap.lop_2D_3D;

public class lop_3D extends lop_2D{
    private float z=0.0f;
    public lop_3D(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }
    public lop_3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z) {
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ() {
        float[] test2=new float[3];
        test2[0]=this.getX();
        test2[1]=this.getY();
        test2[2]=this.getZ();
        return test2;
    }

    @Override
    public String toString() {
        return "lop_3D{"+"x="+getX()+
                ", "+"y="+getY()+
                ", "+"z="+getZ()+
                '}';
    }
    public static void main(String[] args) {
        lop_3D lop_3D=new lop_3D(4,5,6);
        lop_2D lop_2D=new lop_2D(1,2);
        System.out.println(lop_3D.toString());
        System.out.println(lop_2D.toString());
    }
}
