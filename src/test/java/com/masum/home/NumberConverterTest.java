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
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.ROMAN_TO_INTEGER);
        int expectedResult = 1985;
        int actualResult = numberConverter.convertToInteger("MCMLXXXV");
        assertEquals(expectedResult, actualResult);
    }

    /**
     *  unit test to check invalid roman number to conversion return null
     */
    @Test
    public void convertToIntegerInvalidRomanTest() {
        // for MCPQMLXXXV we expect return null. Because it has invalid roman letter P and Q
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.ROMAN_TO_INTEGER);
        Integer actualResult = numberConverter.convertToInteger("MCPQMLXXXV");
        Assert.assertNull(actualResult);
    }

    /**
     * unit test to check correct conversion from octal to decimal
     */
    @Test
    public void convertToIntegerOctalTest() {
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.OCTAL_TO_DECIMAL);
        int expectedResult = 64;
        int actualResult = numberConverter.convertToInteger("100");
        assertEquals(expectedResult, actualResult);
    }
}
