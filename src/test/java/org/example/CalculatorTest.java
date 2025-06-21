package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 2 = 4")
    void TwoPlusTwo_ReturnsFour() {
        assertEquals(4, Calculator.add_nums(2, 2));
    }

    @Test
    @DisplayName("99 + 5 = 104")
    void NinetyNinePlusFive_ReturnsOneHundredAndFour() {
        assertEquals(104, Calculator.add_nums(99, 5));
    }

    @ParameterizedTest
    @CsvSource({"1", "-15", "0"})
    @DisplayName("0 + number = same number")
    void PlusZero_ReturnsSameNumber(int a) {
        assertEquals(a, Calculator.add_nums(a, 0));
        assertEquals(a, Calculator.add_nums(0, a));
    }
}