package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DivByZeroException;


@Service
public class CalculatorService {
    public Number plus(int a, int b) {
        return a + b;
    }

    public Number minus(int a, int b) {
        return a - b;
    }

    public Number multiply(int a, int b) {
        return a * b;
    }

    public Number divide(int a, int b) {
        if (b==0) {
            throw new DivByZeroException();
        }
        return (double) a / b;
    }
}