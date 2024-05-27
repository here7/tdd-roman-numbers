package com.hered7.tddromannumbers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanNumbersApplicationTests {

    private RomanNumbers romanNumbers = new RomanNumbers();

    @Test
    void numberOnetoRoman() {
        String roman = romanNumbers.convertToRoman(1);

        assertEquals(roman, "I");
    }

}
