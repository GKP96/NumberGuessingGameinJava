package com.codestudentsfriendcybercafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // This will generate a random number between 0 to 10::
        System.out.println("In this game u have to guess a number from 1 to 10.");
        System.out.println("To end the game please ENTER any negative number as a guessing number.");
        int i=10000;
        while (i>0)
        { int random = (int) (Math.random()*11);
            System.out.println("Guess a number.");
        int guess = scan.nextInt();
        if(guess==random){
            System.out.println("Great your guess is correct.");
            System.out.print("Guess by computer");
            System.out.println(random);
        }
         if(guess>random&&guess>0){
            System.out.println("Lower number please.");
             System.out.print("Guess by computer");
             System.out.println(random);
        }
         if(guess<random&&guess>0){
            System.out.println("Higher number please.");
             System.out.print("Guess by computer");
             System.out.println(random);
        }
        if(guess<0){
            System.out.println("THANKS for playing this game.");
            break;
        }

        i--;
    }
    }

}
