package second.chapter4;

public class Main {
    public static void main(String[] args){
        // FOURTH CHAPTER
        // Task #4
        Point point = new Point();
        Shape circle = new Circle(point,100);
        Shape rectangle = new Rectangle(point, 100,100);
        Shape line = new Line(point, new Point(10,10));
        System.out.println("Task #4\nCenter of a circle is " + circle.getCenter());
        System.out.println("Center of a rectangle is " + rectangle.getCenter());
        System.out.println("Center of a line is " + line.getCenter());

        // Task #5
        try {
            Rectangle rectangleClone = (Rectangle) rectangle.clone();
            System.out.println("Task #5\nrectangleClone: " + rectangleClone.toString());
            System.out.println("rectangle: " + rectangle.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
