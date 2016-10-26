package com.Travell;

public class Main {

    public static void main(String[] args) {

        String myString = "blah blah blah";
        System.out.println(myString);
        System.out.println("my string is equal to " + myString);
        myString = myString + " \u00A9";
        System.out.println(myString);

        String numberString = "250.55";

        numberString = numberString + 49.95;

        System.out.println("The result is " + numberString);

        String lastString = "10";

        int myInt = 50;

        lastString = lastString +myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
