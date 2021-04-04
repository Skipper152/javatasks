package second.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // FIRST CHAPTER
        Scanner in = new Scanner(System.in);

        //Task #1
        int n1 = in.nextInt();
        T1 t1 = new T1(n1);
        t1.printResult();

        //Task #2
        int n2 = in.nextInt();
        T2 t21 = new T2(n2);
        t21.floorMod();
        System.out.println(t21.getN());
        T2 t22 = new T2(n2);
        t22.percentOp();
        System.out.println(t22.getN());

        //Task #3
        int n31 = in.nextInt();
        int n32 = in.nextInt();
        int n33 = in.nextInt();
        T3 t3 = new T3(n31,n32,n33);
        t3.printMax1();
        t3.printMax2();

        //Task #4
        T4 t4 = new T4();
        t4.largestDoubleNumber();
        t4.smallestDoubleNumber();

        //Task #6
        BigInteger n6 = in.nextBigInteger();
        T6 t6 = new T6();
        System.out.println(t6.computeFactorial(n6));

        //Task #13
        T13 t13 = new T13();
        t13.sortedLotteryCombination();

        in.close();
    }
}
