package ru.prudei.hw.service.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.prudei.hw.service.model.Bag;
import ru.prudei.hw.service.model.Card;

class gameTest {

    @Test
    public void testGame () {
        Bag bag = new Bag(30, 30);
        Card card = new Card(1,30);
        Game game = new Game();
        boolean win = game.start(bag, card);
        Assertions.assertTrue(win);
    }

}