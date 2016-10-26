package com.Travell;

public class Main {

    public static void main(String[] args) {


        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);

        System.out.println("My total =" + myTotal);

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);

        System.out.println("My new byte value = " + myNewByteValue);

        //short has a width of 16
        Short myShortValue = 32767;

        //Long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807l;



        byte myByteTest = 10;

        short myShortTest = 20;

        int myIntTest = 50;


        long myLongTest = 50000l + 10l * (myByteTest + myShortTest + myIntTest);

        System.out.println("My end of lesson test = " + myLongTest);
    }
}
