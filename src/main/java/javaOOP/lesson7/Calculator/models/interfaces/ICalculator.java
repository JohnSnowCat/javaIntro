package javaOOP.lesson7.Calculator.models.interfaces;


import javaOOP.lesson7.Calculator.models.operations.ComplexNumbers;

public interface ICalculator {
    /**
     * сложение
     *
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2);

    /**
     * умножение
     *
     * @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumbers multiply(ComplexNumbers n1, ComplexNumbers n2);

    /**
     * деление
     *
     ** @param n1 первое кч
     * @param n2 второе кч
     * @return результат
     */
    ComplexNumbers divide(ComplexNumbers n1, ComplexNumbers n2);
}