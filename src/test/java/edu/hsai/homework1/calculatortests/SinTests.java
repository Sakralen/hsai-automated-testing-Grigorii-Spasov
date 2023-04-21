package edu.hsai.homework1.calculatortests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SinTests extends CalculatorTests {
    private static final double delta = 0.1;

    @ParameterizedTest
    @CsvSource({"0, 0", "0.5, 0.52", "0.7, 0.79", "0.87, 1.05", "1, 1.57", "0, 3.14", "-1, 4.71"})
    void tableValuesTest(double expected, double input) {
        assertEquals(expected, calculator.sin(input), delta);
    }

    @ParameterizedTest
    @CsvSource({"0", "0.79", "1.57"})
    void plus2PiTest(double input) {
        assertEquals(calculator.sin(input + 2 * Math.PI), calculator.sin(input), delta);
    }
}
