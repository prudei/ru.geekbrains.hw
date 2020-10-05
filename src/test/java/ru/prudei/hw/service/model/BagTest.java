package ru.prudei.hw.service.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    public void testThatPlayingNumbersAreInTheRange () {
        Bag bag = new Bag(90,30);

        boolean check = check(bag);

        Assertions.assertTrue(check);

    }

    public boolean check (Bag bag) {
        int[] numbersForGame = bag.getNumbersForGame();
        for (int i = 0; i<30;i++) {
            if (numbersForGame[i] > 90 || numbersForGame[i] < 0){
                return false;
            }
        }
        return true;
    }

}