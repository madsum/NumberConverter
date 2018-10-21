package com.masum.home;


/** NumberConverter is a generic numbering system conversion class.
 * The idea is that the same class can be used for various type of number conversion.
 * For example, e.g. roman to integer, binary to integer, octal to integer, etc.
 * At this moment it has only roman to Integer and octal to integer conversion.
 * @author Muhammed Masum Islam
 * @version 1.0
 * @since 1.0
 */

public class NumberConverter {

    /**
     * ConversionType that can be used
     * {@link #ROMAN_TO_INTEGER OR}
     * {@link #OCTAL_TO_DECIMAL}
     */
    public enum ConversionType{
        /**
         *  Conversion type roman to integer
         */
        ROMAN_TO_INTEGER,
        /**
         *  Conversion type octal to decimal
         */
        OCTAL_TO_DECIMAL
    }

    /**
     *  Conversion type enum.
     */
    private ConversionType conversionType;

    public NumberConverter(){

    }

    /**
     *   Class constructor
     * @param conversionType type of conversion as enum
     */
    public NumberConverter(ConversionType conversionType) {
        this.conversionType = conversionType;
    }

    /**
     * Converts input roman number to Integer
     * @param input String type roman number
     * @return Integer for a valid roman number.
     */
    private Integer romanCharToInteger(String input){
        if (input == null || input.length() == 0) {
            System.out.println("Empty or null is not allowed! Please enter valid Roman number.");
            return null;
        }
        int number = 0;
        String upperInput = input.toUpperCase();
        for (int i = 0; i< upperInput.length(); i++) {
            int currentCharValue = romanCharToInteger(upperInput.charAt(i));
            if (currentCharValue < 0) {
                System.out.println("Input is not a valid roman number.  Please enter valid Roman number.");
                return null;
            }
            if(i+1 < input.length()){
                int nextCharValue = romanCharToInteger(input.charAt(i+1));
                if(currentCharValue >= nextCharValue){
                    number = number + currentCharValue;
                }else{
                    number = number + nextCharValue - currentCharValue;
                    i++;
                }
            }else{
                number = number + currentCharValue;
                i++;
            }
        }
        return number;
    }

    /**
     *
     * @param letter  repents a roman number
     */
    /**
     *  Get equivalent integer from a valid Roman character
     * @param letter a roman number
     * @return int equivalent roman number.
     */
    private int romanCharToInteger(char letter) {
        switch (letter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return -1;
        }
    }

    /**
     * Convert to Integer from String type of delivered conversion type
     * @param input String type
     * @return Integer equivalent input number
     * @see NumberConverter
     */
   /* public Integer convertToInteger(String input) {
        if(conversionType == ConversionType.ROMAN_TO_INTEGER){
            return romanCharToInteger(input);
        }else if(conversionType == ConversionType.OCTAL_TO_DECIMAL){
            return octalToDecimal(input);
        }else{
            return null;
        }
    }*/

    public Integer romanToIneger(String input){
        return romanCharToInteger(input);
    }
}
