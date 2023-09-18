package obj;

class ComplexNumber {
    public Integer real;
    public Integer imaginary;

    public ComplexNumber(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        Integer real = this.real + other.real;
        Integer imaginary = this.imaginary + other.imaginary;

        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber mul(ComplexNumber other) {
        Integer real = this.real * other.real - this.imaginary * other.imaginary;
        Integer imaginary = this.real * other.imaginary + this.imaginary * other.real;

        return new ComplexNumber(real, imaginary);
    }

    public String toString() {
        return String.format("%d + %di", this.real, this.imaginary);
    }
}
