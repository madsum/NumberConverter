package com.masum.home;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for NumberConverter.
 * Unit test is done extra.
 */
public class NumberConverterTest
{
    /**
     *  unit test to check correct conversion form roman number to integer
     */
    @Test
    public void convertToIntegerRomanTest() {
        // MCMLXXXV as of MCM (1900) + L(50) +XXX(30) + V (5) = 1985
        String romanInput = "MCMLXXXV";
        int expectedResult = 1985;
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.ROMAN_TO_INTEGER);
        int actualResult = numberConverter.convertToInteger(romanInput);
        assertEquals(expectedResult, actualResult);
    }

    /**
     *  unit test to check invalid roman number to conversion return null
     */
    @Test
    public void convertToIntegerInvalidRomanTest() {
        // for MCPQMLXXXV we expect return null. Because it has invalid roman letter P and Q
        String romanInput = "MCPQMLXXXV";
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.ROMAN_TO_INTEGER);
        Integer actualResult = numberConverter.convertToInteger(romanInput);
        Assert.assertNull(actualResult);
    }

    /**
     * unit test to check correct conversion from octal to decimal
     */
    @Test
    public void convertToIntegerOctalTest() {
        // octal 100 = decimal 64
        String octalInput = "100";
        int expectedResult = 64;
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.OCTAL_TO_DECIMAL);
        int actualResult = numberConverter.convertToInteger(octalInput);
        assertEquals(expectedResult, actualResult);
    }
}
