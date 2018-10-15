package com.masum.home;

/**
 *RomanIntegerConverter is to execute check the result of NumberConverter
 *
 */
public class RomanIntegerConverter
{
    public static void main( String[] args )
    {
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.ROMAN_TO_INTEGER);
        System.out.println(numberConverter.convertToInteger(("MCMLXXXV")));
    }
}
