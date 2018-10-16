package com.masum.home;


/** NumberConverter is a generic numbering system conversion utility class.
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
     * Converts input roman number to Integer
     * @param input String type roman number
     * @return Integer for a valid roman number.
     */
    private static Integer romanCharToInteger(String input){
        if (input == null || input.length() == 0) {
            System.out.println("Empty or null is not allowed! Please enter valid Roman number.");
            return null;
        }
        int number = 0;
        for (int i = 0; i< input.length(); i++) {
            int currentCharValue = romanCharToInteger(input.charAt(i));
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
     * Converts octal number to decimal number
     * @param input String type octal number
     * @return Integer for valid octal input
     */
    private static Integer octalToDecimal(String input){
        try{
           return Integer.parseInt(input,8);
        }catch (NumberFormatException ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        return null;
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
    private static int romanCharToInteger(char letter) {
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

    /**
     *
     * @param input number (either roman  or octal number)
     * @param conversionType type of conversion either  ConversionType.ROMAN_TO_INTEGER or
     *                       ConversionType.OCTAL_TO_DECIMAL
     * @return Integer of the equivalent input number and desired conversion type.
     */
    public static Integer convertToInteger(String input, ConversionType conversionType) {
        if(conversionType == ConversionType.ROMAN_TO_INTEGER){
            return romanCharToInteger(input);
        }else if(conversionType == ConversionType.OCTAL_TO_DECIMAL){
            return octalToDecimal(input);
        }else{
            return null;
        }
    }

}
