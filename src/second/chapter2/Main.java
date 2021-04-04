package second.chapter2;

public class Main {
    public static void main(String[] args) {
        // SECOND CHAPTER
        // Task #5
        Point t5 = new Point(3,4);
        t5.translate(1,3);
        t5.scale(0.5);
        System.out.println(t5);

        // Task #9
        Car t9 = new Car(20);
        t9.fillUpGas(6);
        t9.move(50);
        System.out.println(t9);
        t9.fillUpGas(6);
        t9.move(220);
        System.out.println(t9);

    }
}
