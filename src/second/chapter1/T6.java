package second.chapter1;

import java.math.BigInteger;

public class T6 {
    public BigInteger computeFactorial(BigInteger n) {
        if (n.equals(BigInteger.valueOf(0)))
            return BigInteger.valueOf(1);
        if (n.equals(BigInteger.valueOf(1)))
            return n;
        return n.multiply(computeFactorial(n.subtract(BigInteger.valueOf(1))));
    }
}
