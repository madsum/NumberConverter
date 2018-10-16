package com.masum.home;

/**
 *OctalIntegerConverter is simple main class to execute NumberConverter to check the result of
 *octal to integer conversion.
 *
 */
public class OctalIntegerConverter {
    public static void main( String[] args )
    {
        System.out.println(NumberConverter.convertToInteger("100", NumberConverter.ConversionType.OCTAL_TO_DECIMAL));
    }
}
