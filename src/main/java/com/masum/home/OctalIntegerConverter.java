package com.masum.home;

/**
 *OctalIntegerConverter is simple main to execute NumberConverter to check the result of
 *octal to integer conversion.
 *
 */
public class OctalIntegerConverter {
    public static void main( String[] args )
    {
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.OCTAL_TO_DECIMAL);
        System.out.println(numberConverter.convertToInteger(("100")));
    }
}
