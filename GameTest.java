import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {

    @Test
    public void testInitialization() {
        Game game = new Game();
        assertEquals('X', game.getCurrentPlayer());
    }

    @Test
    public void testMakeMove() {
        Game game = new Game();
        assertTrue(game.makeMove(0, 0));
        assertEquals('O', game.getCurrentPlayer());
        assertFalse(game.makeMove(0, 0));  // Should not allow overwriting a move
    }

    // Write more tests to cover various aspects of the game logic

    @Test
    public void testCheckWin() {
        // Write tests for win conditions
    }

    @Test
    public void testDraw() {
        // Write a test for a draw
    }

    @Test
    public void testReset() {
        // Write a test for the reset method
    }
}

