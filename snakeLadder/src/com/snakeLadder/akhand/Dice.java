package com.snakeLadder.akhand;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    int diceNumber;
    int noOfDices;

    public Dice(int noOfDices){
        this.noOfDices = noOfDices;
    }
    public int rollDice(){
        diceNumber=0;
        int n=noOfDices;
        while(n>0){
            diceNumber+= ThreadLocalRandom.current().nextInt(1, 6);
            n--;
        }
        return diceNumber;
    }
}
