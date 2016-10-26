package iantravell.com;

public class Main {

    public static void main(String[] args) {

        int topScore = 80;
        int secondTopScore = 101;

        if((topScore > 90 || (secondTopScore > 100)))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("THis is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        System.out.println("wasCar is true");

        double myDouble = 20d;
        double mySecondDouble = 80d;

        double myTotal = (myDouble + mySecondDouble) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("The remainder is " + theRemainder);
        if(theRemainder <= 20)
        System.out.println("Total was over the limit");

    }
}
