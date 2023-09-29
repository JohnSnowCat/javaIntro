package javaOOP.lesson7.Calculator.models.operations;

public class ComplexNumbers {
    private double material;
    private double imaginary;

    /**
     *
     * @param material      Вещественная
     * @param imaginary     Мнимая часть
     */
    public ComplexNumbers(double material, double imaginary) {
        this.material = material;
        this.imaginary = imaginary;
    }

    /**
     *
     * @return Вещественная часть
     */
    public double getmaterial() {
        return material;
    }

    /**
     * @return Мнимая часть
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * сложение
     *
     * @return Результат сложения
     */
    public ComplexNumbers add(ComplexNumbers other) {
        double sumMaterial = this.material + other.material;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumbers(sumMaterial, sumImaginary);
    }

    /**
     * умножение
     *
     * @return Результат умножения
     */
    public ComplexNumbers multiplication(ComplexNumbers other) {
        double productMaterial = this.material * other.material - this.imaginary * other.imaginary;
        double productImaginary = this.material * other.imaginary + this.imaginary * other.material;
        return new ComplexNumbers(productMaterial, productImaginary);
    }

    /**
     * деление
     *
     * @return Результат деления
     */
    public ComplexNumbers divide(ComplexNumbers other) {
        double divisor = other.material * other.material + other.imaginary * other.imaginary;
        double qMaterial = (this.material * other.material + this.imaginary * other.imaginary) / divisor;
        double qImaginary = (this.imaginary * other.material - this.material * other.imaginary) / divisor;
        return new ComplexNumbers(qMaterial, qImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return material + " + " + imaginary + "i";
        } else {
            return material + " - " + Math.abs(imaginary) + "i";
        }
    }
}