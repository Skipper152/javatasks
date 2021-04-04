package second.chapter1;

public class T2 {

    private int deg;

    public T2(int n) {
        this.deg = (int) (n * 180 / Math.PI);
    }

    public void floorMod() {
        deg = Math.floorMod(deg, 360);
    }

    public void percentOp() {
        if (deg < 0)
            deg = 360 + (deg % 360);
        else
            deg = deg % 360;
    }

    public int getN() {
        return deg;
    }
}
