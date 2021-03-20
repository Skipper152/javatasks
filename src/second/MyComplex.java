package second;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
            return "(" + real + '+' + imag + "i)";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (real == another.getReal() && imag == another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        real += right.getReal();
        imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        real -= right.getReal();
        imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        real = real * right.getReal() - imag * right.getImag();
        imag = real * right.getImag() + right.getReal() * imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        real = (real * right.getReal() + imag * right.getImag()) / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        imag = (imag * right.getReal() - real * right.getImag()) / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}
