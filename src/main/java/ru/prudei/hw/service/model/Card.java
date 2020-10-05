package ru.prudei.hw.service.model;

import java.util.ArrayList;
import java.util.Collections;

public class Card {

    private int id;
    private int amountOfGameNumbers;

    private ArrayList<Integer> card1;

    public int[][] getLines() {
        return lines;
    }

    private int[][] lines;

    public Card(int id, int amountOfGameNumbers) {
        this.id = id;
        this.amountOfGameNumbers = amountOfGameNumbers;
        generate();
    }


    public int getId() {
        return id;
    }


    private void generateNumbers () {
        card1 = new ArrayList<>();
        for (int i = 0; i < amountOfGameNumbers; i++) {
            card1.add(i+1);
        }
    }

    private void shuffleCard() {
        Collections.shuffle(card1);
    }

    private void generate() {

        generateNumbers();
        shuffleCard();

        lines = new int[3][5];

        for (int i = 0; i < 5; i++) {
            lines[0][i] = card1.get(i);
        }
        for (int i = 0,j=5; j < 10; i++,j++) {
            lines[1][i] = card1.get(j);
        }
        for (int i = 0,j=10; j < 15; i++,j++) {
            lines[2][i] = card1.get(j);
        }
    }
}
