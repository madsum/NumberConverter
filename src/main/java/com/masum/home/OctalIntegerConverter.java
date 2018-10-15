package com.masum.home;

/**
 *OctalIntegerConverter is to execute check the result of NumberConverter
 *
 */
public class OctalIntegerConverter {
    public static void main( String[] args )
    {
        NumberConverter numberConverter = new NumberConverter(NumberConverter.ConversionType.OCTAL_TO_DECIMAL);
        System.out.println(numberConverter.convertToInteger(("100")));
    }
}
