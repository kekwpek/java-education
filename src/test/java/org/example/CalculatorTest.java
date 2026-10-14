package org.example;

import org.junit.jupiter.api.Test; // импортируем аннотацию JUnit

import static org.junit.jupiter.api.Assertions.*; // импортируем методы assert

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result); // проверяем, что 2+3 = 5
    }
    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        int result2 = calc.sub(10, 4);
        assertEquals(6, result2);
    }
    @Test
    public void testMul() {
        Calculator calc = new Calculator();
        int result3 = calc.mul(7, 6);
        assertEquals(42, result3);
    }
    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        int result4 = calc.div(10, 2);
        assertEquals(5, result4);
    }
    @Test
    public void testDivByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.div(10,0));
    }
}
