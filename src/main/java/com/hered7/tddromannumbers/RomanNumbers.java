package com.hered7.tddromannumbers;

public class RomanNumbers {
    public String convertToRoman(int naturalNumber) {
        if(naturalNumber == 2){
            return "II";
        }
        return "I";
    }
}
