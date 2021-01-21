package semester_two.week_one;

import java.util.Objects;

/**
 * A class representing a complex number.
 *
 * @author Michael Muzzarelli
 */
public class Complex {

    private int real, imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(int value) {
        this.real = value;
    }

    public void setImaginary(int value) {
        this.imaginary = value;
    }
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public Complex add(Complex c) {
        return null;
    }

    public Complex subtract(Complex c) {
        return null;
    }

    public Complex multiply(Complex c) {
        return null;
    }

    public Complex divide(Complex c) {
        return null;
    }

    public Complex distance(Complex c) {
        return null;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }
}