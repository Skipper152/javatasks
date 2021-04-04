package second.chapter1;

public class T1 {

    private int n;

    public T1(int n) {
        this.n = n;
    }

    public void printResult() {
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));
        System.out.println("Hex: " + Integer.toHexString(n));
        System.out.println("Reciprocal as a hex: " + Float.toHexString(n));
    }
}
