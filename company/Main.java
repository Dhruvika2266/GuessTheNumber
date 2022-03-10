package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int computerInput;
    public int userInput;
    public int noOfGuesses = 0;

    public Game(){
        Random random = new Random();
        this.computerInput = random.nextInt(100);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any number between 1 to 100: ");
        userInput = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses ++;
        if(userInput == computerInput){
            System.out.printf("You guess the number correct. It was %d.\nYou guessed it in %d attempts.\n", computerInput, noOfGuesses);
            return true;
        }
        else if(userInput<computerInput){
            System.out.println("Too low number.");
        }
        else if(userInput>computerInput){
            System.out.println("Too high number.");
        }
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
    }
}
