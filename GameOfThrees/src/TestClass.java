/**
 * Created by JJ Marrs on 10/23/2016.
 * plays the Threes game, and outputs a valid sequence of steps you need to take to get to 1.
 * Each step should be output as the number you start at, followed by either -1 or 1
 * (if you are adding/subtracting 1 before dividing), or 0 (if you are just dividing).
 * The last line should simply be 1.
 */

import java.util.*;

public class TestClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        int userInput = input.nextInt();

        playTheGame(userInput);
    } //end main

    public static void playTheGame(int userInput){
        do{
            if(userInput % 3 == 0) {
                System.out.println(userInput + " " + "add 0");
                userInput /= 3;
            }
            else {
                if( (userInput + 1) % 3 == 0) { // if userInput is equally divisible by 3...
                    userInput += 1;
                    System.out.println(userInput - 1 + " " + "add 1");
                    userInput /= 3;
                }
                else{ // ... else subtract 1 and divide by 3
                    System.out.println(userInput + " " + "minus 1");
                    userInput -= 1;
                    userInput /= 3;
                }
            }
        }while(userInput != 1);
        System.out.println(userInput + "");
    } //end playTheGame
} //end class
