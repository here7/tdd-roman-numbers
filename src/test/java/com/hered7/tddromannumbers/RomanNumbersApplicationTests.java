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

    @Test
    void numberTwotoRoman() {
        String roman = romanNumbers.convertToRoman(2);

        assertEquals(roman, "II");
    }

    @Test
    void numberFourtoRoman() {
        String roman = romanNumbers.convertToRoman(4);

        assertEquals(roman, "IV");
    }
    @Test
    void numberFivetoRoman() {
        String roman = romanNumbers.convertToRoman(5);

        assertEquals(roman, "V");
    }
    @Test
    void numberTentoRoman() {
        String roman = romanNumbers.convertToRoman(10);

        assertEquals(roman, "X");
    }
    @Test
    void numberFiftytoRoman() {
        String roman = romanNumbers.convertToRoman(50);

        assertEquals(roman, "L");
    }
    @Test
    void numberHundredtoRoman() {
        String roman = romanNumbers.convertToRoman(100);

        assertEquals(roman, "C");
    }
    @Test
    void numberFiveHundredtoRoman() {
        String roman = romanNumbers.convertToRoman(500);

        assertEquals(roman, "D");
    }
    @Test
    void numberThousandtoRoman() {
        String roman = romanNumbers.convertToRoman(1000);

        assertEquals(roman, "M");
    }
}
