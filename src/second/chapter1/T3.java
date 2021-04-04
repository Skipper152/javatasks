package second.chapter1;

public class T3 {

    private int n1;
    private int n2;
    private int n3;

    public T3(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void printMax1 () {
        int max = n1;
        if (max < n2)
            max = n2;
        if (max < n3)
            max = n3;
        System.out.println("Max number is " + max + " (not using embedded function max)");
    }

    public void printMax2 () {
        int max = Math.max(n1, n2);
        if (max < n3)
            max = n3;
        System.out.println("Max number is " + max + " (using embedded function max)");
    }
}
