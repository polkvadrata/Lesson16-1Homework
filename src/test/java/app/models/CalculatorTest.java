package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void sum() {
        assertEquals(4,calculator.sum(2,2));
    }

    @Test
    void subtract() {
        assertEquals(2,calculator.subtract(4,2));
    }

    @Test
    void multiply() {
        assertEquals(4,calculator.multiply(2,2));
    }

    @Test
    void divideRegular() {
        assertEquals(2,calculator.divide(4,2));
    }

    @Test
    void divideZero() {
        double inf = Double.NEGATIVE_INFINITY;
        assertEquals(inf,calculator.divide(-2,0));
    }
}