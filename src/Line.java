public class Line  extends Shape implements Scalable {

    private double x0;
    private double y0;
    private double x1;
    private double y1;

    public Line(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.setX(((this.x0+this.x1)/2));
        this.setY(((this.y0+this.y1)/2));
    }

    public double getX0() {
        return this.x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return this.y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getX1() {
        return this.x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return this.y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }



    public void scale(double sf) {
        this.setX(getX()*sf);
        this.setY(getY()*sf);
   }


    public void scale(double sx, double sy) {
       // this.setX(getX()*sx);
       // this.setY(getY()*sy);
        this.x0 *= sx;
        this.x1 *= sx;
        this.y0 *= sy;
        this.y1 *= sy;
        this.setX((this.x0 + this.x1) / 2.0D);
        this.setY((this.y0 + this.y1) / 2.0D);

    }
    public void move(double dx,double dy) {
       /* this.setX0((this.getX0() + dx));
        this.setX1((this.getX1() + dx));
        this.setY0((this.getY0() + dy));
        this.setY1((this.getY1() + dy));
        this.setX((this.getX0() + this.getX1() / 2));
        this.setY((this.getY0() + this.getY1() / 2));
        */
       this.x0+=dx;
       this.x1+=dx;
       this.y0+=dy;
       this.y1+=dy;
        this.setX(((this.x0+this.x1)/2));
        this.setY(((this.y0+this.y1)/2));
    }

}
