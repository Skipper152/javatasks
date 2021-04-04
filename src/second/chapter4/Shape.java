package second.chapter4;

public abstract class Shape implements Cloneable {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();

    public Point getPoint() {
        return point;
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        Shape cloneShape = (Shape) super.clone();
        cloneShape.point = new Point(getPoint().getX(), getPoint().getY());
        return cloneShape;
    }
}
