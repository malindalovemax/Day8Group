public abstract class Shape {
    private double x;
    private double y;
    private String color;

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void move(double dx, double dy);


    public void printLocation(){
        System.out.println("X coordinates :" +this.x);
        System.out.println("Y coordinates :" +this.y);
    }
}
