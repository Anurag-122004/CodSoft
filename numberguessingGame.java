import java.util.Scanner;

import java.util.Random;

class numberguessingGame {

    public static void createnumberguessingGame() {
            
        Random choose = new Random();

        int generatedNumber = choose.nextInt(100) + 1;

        Scanner scan = new Scanner (System.in);

        System.out.println("You have only Five attempts ");

        System.out.println();

        int attempts = 1 ;

        int count = 0;

        System.out.println("Hey , Please enter your Guess (1-100) :");

            while ( attempts < 6 ) {

                int yourNumber = scan.nextInt();

                count++;

                if ( generatedNumber == yourNumber ) {

                    System.out.println("Hurrah!!, you won");

                    System.out.println("You took "+count+" tries to win");

                    return;
                }

                else if ( generatedNumber > yourNumber ) {

                    System.out.println("The number is greater than your number, TRY AGAIN");

                }

                else  {

                    System.out.println("The number is smaller than your number, TRY AGAIN");

                }

                attempts++;
            }

            System.out.println();

            System.out.println("Sorry you have 0 attempts remaining , Thank You");

            System.out.println();

            System.out.println("Random Number was :"+generatedNumber);

        scan.close();
    }

    public static void main(String[] args) {

        createnumberguessingGame();

    }
}