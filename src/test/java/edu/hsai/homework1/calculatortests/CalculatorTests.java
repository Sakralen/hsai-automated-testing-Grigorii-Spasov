package edu.hsai.homework1.calculatortests;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTests {
    protected static Calculator calculator;
    protected static final double delta = 0.1;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }
}
