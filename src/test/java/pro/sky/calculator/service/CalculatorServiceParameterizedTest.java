package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.exception.DivByZeroException;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusTestParams () {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(-1,2,1),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> minusTestParams () {
        return Stream.of(
                Arguments.of(1,2,-1),
                Arguments.of(-1,2,-3),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> multiplyTestParams () {
        return Stream.of(
                Arguments.of(1,2,2),
                Arguments.of(-1,2,-2),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> divideTestParams () {
        return Stream.of(
                Arguments.of(1,2,0.5),
                Arguments.of(-1,2,-0.5),
                Arguments.of(0,5,0)
        );
    }

    public static Stream<Arguments> divideNegativeTestParams () {
        return Stream.of(
                Arguments.of(1,0),
                Arguments.of(-1,0)

        );
    }

    @ParameterizedTest
    @MethodSource("plusTestParams")
    public void plusTest (int a, int b ) {
        Number actual = calculatorService.plus(1,2);
        Number expected = 3;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.plus(-1,2);
        expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("minusTestParams")
    public void minusTest (int a, int b ) {
        Number actual = calculatorService.minus(1,2);
        Number expected = -1;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.minus(-1,2);
        expected = -3;

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("multiplyTestParams")
    public void multiplyTest (int a, int b ) {
        Number actual = calculatorService.multiply(1,2);
        Number expected = 2;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.multiply(-1,2);
        expected = -2;

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("divideTestParams")
    public void divideTest (int a, int b) {
        Number actual = calculatorService.divide(1,2);
        Number expected = 0.5;

        Assertions.assertEquals(expected,actual);

        actual = calculatorService.divide(-1,2);
        expected = -0.5;

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("divideNegativeTestParams")
    public void divideNegativeTest (int a, int b) {
        Assertions.assertThrows(DivByZeroException.class,()-> calculatorService.divide(1, 0));
        Assertions.assertThrows(DivByZeroException.class,()-> calculatorService.divide(-1, 0));
    }
}
