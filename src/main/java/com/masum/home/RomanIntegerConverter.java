package com.masum.home;

/**
 *RomanIntegerConverter is simple main to execute NumberConverter to check the result of
 *roman to integer conversion.
 *
 */
public class RomanIntegerConverter
{
    public static void main( String[] args )
    {
        System.out.println(NumberConverter.convertToInteger("MCMLXXXV", NumberConverter.ConversionType.ROMAN_TO_INTEGER));
    }
}
