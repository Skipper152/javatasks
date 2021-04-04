package second.chapter4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().getX() + width / 2, getPoint().getY() + height / 2);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        Rectangle cloneRectangle = (Rectangle) super.clone();
        cloneRectangle.width = width;
        cloneRectangle.height = height;
        return cloneRectangle;
    }
}
