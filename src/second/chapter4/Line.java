package second.chapter4;

public class Line extends Shape {
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((to.getX() - getPoint().getX()) / 2,(to.getY() - getPoint().getY()) / 2);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        Line cloneLine = (Line) super.clone();
        cloneLine.to = new Point(to.getX(), to.getY());
        return cloneLine;
    }
}
