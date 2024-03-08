package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calcSum_shouldReturn15_whenCalledWith10And5() {
        // GIVEN
        int a = 10;
        int b = 5;
        int expected = 15;
        // WHEN
        int actual = Main.calcSum(a, b);
        // THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenNrIsEven() {
        // GIVEN
        int a = 2;
        // WHEN
        boolean checkNrIsEven = Main.isEven(a);
        // THEN
        Assertions.assertTrue(checkNrIsEven);
    }

    @Test
    void isEven_shouldReturnFalse_whenNrIsNotEven() {
        // GIVEN
        int a = 3;
        // WHEN
        boolean checkNrNotEven = Main.isEven(a);
        // THEN
        Assertions.assertFalse(checkNrNotEven);
    }

    @Test
    void productTowNumbers_shouldReturnTrue_whenNrIsProducted() {
        // GIVEN
        int a = 2;
        int b = 4;
        int expected = 8;
        // WHEN
        int checkNrIsProduced = Main.productTwoNumbers(a, b);
        // THEN
        Assertions.assertEquals(expected, checkNrIsProduced);
    }

    @Test
    void convertToUpperCase_shouldReturnTrue_whenStringIsUpperCase() {
        // GIVEN
        String text = "testing_purpose";
        String expected = "TESTING_PURPOSE";
        // WHEN
        String UpperCasedText = Main.convertStringToUpperCase(text);
        // THEN
        Assertions.assertEquals(expected, UpperCasedText);
    }

    @Test
    void checkIfNumberIsPositive_shouldReturnTrue_whenNumberIsPositive() {
        // GIVEN
        int a = 1;
        // WHEN
        boolean checkedNr = Main.checkIfNumberIsPositive(a);
        // THEN
        Assertions.assertTrue(checkedNr);
    }
}