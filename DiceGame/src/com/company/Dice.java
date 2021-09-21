package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Dice {
    public static final int NUM_OF_FACES = 6;
    public static final int PERCENT_NORMAL = 16;
    public static final int PERCENT_HIGH = 20;
    private int currentFace;
    private int ith;
    private ArrayList<Integer> randomList = new ArrayList<>();

    public Dice(int ith){
        if ((ith > 0) && (ith < NUM_OF_FACES)){
            this.ith = ith;
            for (int i = 1; i < NUM_OF_FACES; i++){
                if (i != ith){
                    for (int j=0; j<PERCENT_NORMAL; j++){
                        randomList.add(i);
                    }
                }
                else {
                    for (int j=0; j<PERCENT_HIGH; j++){
                        randomList.add(i);
                    }
                }
            }
        }
        else {
            throw new IllegalArgumentException("The number of dice must < 6");
        }
    }

    public int getCurrentFace() {
        return currentFace;
    }

    public int roll(){
        Random rand = new Random();
        currentFace = randomList.get(rand.nextInt(randomList.size()));
        return currentFace;
    }
}
