package com.masum.home;

public class OctalToInteger extends NumberConverter {

    public OctalToInteger(){

    }

    /**
     * Converts octal number to decimal number
     * @param input String type octal number
     * @return Integer for valid octal input
     */
    public Integer octalToDecimal(String input){
        try{
            return Integer.parseInt(input,8);
        }catch (NumberFormatException ex){
            System.out.println("Exception: "+ex.getMessage());
        }
        return null;
    }


}
