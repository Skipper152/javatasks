package second.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder pol = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            pol.append(coeffs[i]).append(i != 0? ("*x^" + i + '+'): "");
        }
        return pol.toString();
    }

    public double evaluate(double x) {
        double result = coeffs[0];
        for (int i = 1; i <= getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int minDeg = Math.min(this.getDegree(), right.getDegree());
        int maxDeg = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDeg + 1];
        for (int i = 0; i <= minDeg; i++) {
            newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree()) {
            for (int i = minDeg + 1; i <= maxDeg; i++) {
                newCoeffs[i] = this.coeffs[i];
            }
        } else if (this.getDegree() < right.getDegree()) {
            for (int i = minDeg + 1; i <= maxDeg; i++) {
                newCoeffs[i] = right.coeffs[i];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); ++i) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
