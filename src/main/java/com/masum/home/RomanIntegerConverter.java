package com.masum.home;

/**
 *RomanIntegerConverter is to execute check the result of NumberConverter
 *
 */
public class RomanIntegerConverter
{
    public static void main( String[] args )
    {
        System.out.println(NumberConverter.convertToInteger("MCMLXXXV", NumberConverter.ConversionType.ROMAN_TO_INTEGER));
    }
}
