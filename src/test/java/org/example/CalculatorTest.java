package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 2 = 4")
    void twoPlusTwoReturnsFour() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("99 + 5 = 104")
    void ninetyNinePlusFiveReturnsOneHundredAndFour() {
        assertEquals(104, Calculator.add(99, 5));
    }

    @ParameterizedTest
    @CsvSource({"1", "-15", "0"})
    @DisplayName("0 + number = same number")
    void plusZeroReturnsSameNumber(int a) {
        assertEquals(a, Calculator.add(a, 0));
        assertEquals(a, Calculator.add(0, a));
    }
}