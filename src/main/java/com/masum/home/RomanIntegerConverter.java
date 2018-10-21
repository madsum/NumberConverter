package com.masum.home;

import java.util.Scanner;

/**
 *RomanIntegerConverter is simple main to execute NumberConverter to check the result of
 *roman to integer conversion.
 *
 */
public class RomanIntegerConverter
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. To convert Roman to Integer: ");
        System.out.printf("2. To convert Octal to Integer: ");
        String userInput = input.next();
        if(userInput.compareToIgnoreCase("1") == 0){
            NumberConverter numberConverter = new NumberConverter();
            System.out.println("Enter valid Roman character: ");
            userInput = input.next();
            Integer returnInt = numberConverter.romanToIneger(userInput);
            System.out.println(userInput+ "= "+returnInt);
        }else if(userInput.compareToIgnoreCase("2") == 0){
            OctalToInteger octalToInteger = new OctalToInteger();
            System.out.println("Enter valid Octal character: ");
            userInput = input.next();
            Integer returnOctal = octalToInteger.octalToDecimal(userInput);
            System.out.println(returnOctal);
        }
    }
}
