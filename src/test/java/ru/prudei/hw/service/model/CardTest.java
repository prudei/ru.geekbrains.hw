package ru.prudei.hw.service.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {

    @Test
    public void checkRangeOfCard () {

        int amountOfNumbers = 15;

        Card card = new Card(1, amountOfNumbers);

        boolean b = checkRangeOfCard(card);


        Assertions.assertTrue(b);
    }


    public boolean checkRangeOfCard(Card card) {
        int[][] lines = card.getLines();
        boolean bool = false;
        for (int k = 0; k < lines.length; k++) {
            for (int i = 0; i<lines[0].length;i++)
                if (0 < lines[k][i] & lines[k][i] < 16){
                    bool = true;
                }

        }
        return bool;
    }

}
