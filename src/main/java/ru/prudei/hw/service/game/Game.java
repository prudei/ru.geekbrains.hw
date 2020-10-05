package ru.prudei.hw.service.game;

import ru.prudei.hw.service.model.Bag;
import ru.prudei.hw.service.model.Card;

public class Game {

    public boolean start(Bag bag, Card card) {
        boolean checkWin = win(bag, card);
        return checkWin;
    }

    private boolean win (Bag bag, Card card) {

        int[] numbersForGame = bag.getNumbersForGame();
        int[][] ticketLines;
        int[] count = new int[3];

        ticketLines = card.getLines();



        for (int j = 0; j<numbersForGame.length;j++) {
            for (int k = 0; k < ticketLines.length; k++) {
                for (int i = 0; i<ticketLines[0].length;i++)
                if (ticketLines[k][i] == numbersForGame[j]){
                    count[k]++;
                }
            }
        }

        if (count[0] == 5 || count[1] == 5|| count[2] == 5) {
            return true;
        }
        return false;
    }
}

