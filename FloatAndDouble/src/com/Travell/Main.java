package com.Travell;

public class Main {

    public static void main(String[] args) {

        //width of an int = 32 (4 bytes)
        int myIntvalue = 5 /3;
        //width of a float = 32 (4 bytes)
        float myFloatValue = 5f /3f;
        //width of a double = 64 (8 bytes)
        double myDobubleValue = 5d /3d;

        System.out.println("my Int value = " + myIntvalue);
        System.out.println("my Int value = " + myFloatValue);
        System.out.println("my Int value = " + myDobubleValue);


        double numberofPounds = 200d;

        double exerciseResult = numberofPounds * 0.45359237;

        System.out.println("the conversion of 8 pounds to Kilos = " + exerciseResult);







    }
}
