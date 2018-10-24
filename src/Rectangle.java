public class Rectangle extends Shape implements Scalable,Fillable {
    private double width;
    private double height;
    private boolean filled;

    public Rectangle(double x,double y,double width,double height)
    {
        this.setX(x);
        this.setY(y);
        this.width=width;
        this.height=height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFilled() {
        if(this.filled==true){
           return true;
        }
        else
        {
            return false;
        }

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void move(double dx,double dy) {

        this.setX(getX()+dx);
        this.setY(getY()+dy);
    }

    public void scale(double s){
        this.width*=s;
        this.height*=s;


    }
    public void scale(double sH,double sW)
    {
        this.width*=sW;
        this.height=sH;

    }


}
