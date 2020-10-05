package ru.prudei.hw.service.model;

import java.util.*;

public class Bag {

    private int amountOfNumbers;
    private int amountOfGameNumbers;

    public Bag(int amountOfNumbers, int amountOfGameNumbers) {
        this.amountOfNumbers = amountOfNumbers;
        this.amountOfGameNumbers = amountOfGameNumbers;
    }

    private List<Integer> bag;

    private void generateBag () {
        bag = new ArrayList<>();
        for (int i = 0; i < amountOfNumbers; i++) {
            bag.add(i+1);
        }
    }

    private void shuffleBag () {
        Collections.shuffle(bag);
    }

    public int[] getNumbersForGame() {
        int [] gamesNumber = new int[30];
        generateBag();
        shuffleBag();
        for (int i = 0; i<amountOfGameNumbers; i++) {
            gamesNumber[i] = bag.get(i);
        }
        return gamesNumber;
    }
}
