import java.util.Random;
import java.util.Scanner;

/**
 * Guessing_Game
 */
public class Guessing_Game {

    public static void main(String[] args) {
        
        int minimum = 1 ;
        int maximum = 100 ;
        int attempts = 5 ; 
        Random Number = new Random() ;
        int numberToguess = Number.nextInt(maximum-minimum +1)+1;

        Scanner sc = new Scanner(System.in) ;
        int attemptsRemaining = attempts ;

        while(attemptsRemaining>0){
            System.out.println("Attempts remaining :" +attemptsRemaining);

            System.out.println("Guess a number between : "+minimum +" to " +maximum);
            int userInput = sc.nextInt();

            if(userInput == numberToguess){
                System.out.println("!!! You won !!!");
                break ;
            }else if(userInput < numberToguess){
                System.out.println(" ! Too low !");
            }else {
                System.out.println(" ! Too high !");
            }
            attemptsRemaining -- ;

            }
            if (attemptsRemaining == 0) {
                System.out.println("Sorry, you lost! The correct answer was : " + numberToguess);
            }
            sc.close();
        }

        
    }
