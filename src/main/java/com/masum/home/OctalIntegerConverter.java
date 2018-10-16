package com.masum.home;

/**
 *OctalIntegerConverter is to execute check the result of NumberConverter
 *
 */
public class OctalIntegerConverter {
    public static void main( String[] args )
    {
        System.out.println(NumberConverter.convertToInteger("100", NumberConverter.ConversionType.OCTAL_TO_DECIMAL));
    }
}
