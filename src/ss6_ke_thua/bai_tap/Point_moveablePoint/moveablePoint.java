package ss6_ke_thua.bai_tap.Point_moveablePoint;

public class moveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public moveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public moveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public moveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void Speed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed() {
        float[] speed=new float[2];
        speed[0]=getxSpeed();
        speed[1]=getySpeed();
        return speed;
    }

    @Override
    public String toString() {
        return "moveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public moveablePoint move() {
        this.setX(this.getX()+this.xSpeed);
         this.setY(this.getY()+this.ySpeed);
         return this;
    }
}
