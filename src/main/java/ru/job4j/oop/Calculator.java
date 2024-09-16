package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        System.out.println(resultSum);

        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(5);
        System.out.println(resultMultiply);

        int resultMinus = minus(10);
        System.out.println(resultMinus);

        Calculator calcDivide = new Calculator();
        int resultDivide = calcDivide.divide(25);
        System.out.println(resultDivide);

        Calculator calcSumAll = new Calculator();
        int resultSumAll = calcSumAll.sumAllOperation(5);
        System.out.println(resultSumAll);
    }
}