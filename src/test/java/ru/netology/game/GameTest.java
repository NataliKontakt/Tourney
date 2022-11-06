package ru.netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Player;

import java.util.ArrayList;

public class GameTest {
    Player player1 = new Player(11, "Pasha", 100);
    Player player2 = new Player(12, "Sasha", 90);
    Player player3 = new Player(13, "Vitya", 120);
    Player player4 = new Player(14, "Lesha", 300);
    Player player5 = new Player(15, "Vanya", 300);


    @Test
    public void testPlayer1() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertEquals(1 , game.round("Pasha", "Sasha"));
    }
    @Test
    public void testPlayer2() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertEquals(0 , game.round("Lesha", "Vanya"));
    }
    @Test
    public void testPlayer3() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertEquals(2 , game.round("Vitya", "Vanya"));
    }
    @Test
    public void testPlayer4() {
        Game game = new Game();

        Assertions.assertEquals(null , game.findByName("Pasha"));
    }
    @Test
    public void testPlayer5() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertThrows(RuntimeException.class, ()->{
            game.round("Vitya", "Kirill");
        });
    }
    @Test
    public void testPlayer6() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertThrows(RuntimeException.class, ()->{
            game.round("Kirill", "Vanya");
        });
    }
    @Test
    public void testPlayer7() {
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
        Assertions.assertThrows(RuntimeException.class, ()->{
            game.round("Kirill", "Yana");
        });
    }

}
