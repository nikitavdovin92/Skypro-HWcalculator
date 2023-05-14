package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivByZeroException;

public class CalculatorTestService {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest () {
        Number actual = calculatorService.plus(1,2);
        Number expected = 3;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.plus(-1,2);
        expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void minusTest () {
        Number actual = calculatorService.minus(1,2);
        Number expected = -1;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.minus(-1,2);
        expected = -3;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest () {
        Number actual = calculatorService.multiply(1,2);
        Number expected = 2;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.multiply(-1,2);
        expected = -2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideTest () {
        Number actual = calculatorService.divide(1,2);
        Number expected = 0.5;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.divide(-1,2);
        expected = -0.5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void divideNegativeTest () {
        Assertions.assertThrows(DivByZeroException.class,()-> calculatorService.divide(1, 0));
        Assertions.assertThrows(DivByZeroException.class,()-> calculatorService.divide(-1, 0));
    }
}
