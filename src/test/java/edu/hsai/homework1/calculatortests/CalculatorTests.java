package edu.hsai.homework1.calculatortests;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTests {
    protected static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }
}
