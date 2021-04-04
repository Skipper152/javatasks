package second.chapter4;

public class Circle extends Shape{
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        Circle cloneCircle = (Circle) super.clone();
        cloneCircle.radius = radius;
        return cloneCircle;
    }
}
