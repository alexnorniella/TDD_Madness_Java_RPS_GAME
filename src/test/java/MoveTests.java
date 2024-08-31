import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveTests {
    @Test
    public void testMoveContainsAllValues(){
        // Check that the Move enum contains ROCK, PAPER, and SCISSORS
        assertDoesNotThrow(() -> Move.valueOf("ROCK"), "ROCK should be a valid Move enum constant");
        assertDoesNotThrow(() -> Move.valueOf("PAPER"), "PAPER should be a valid Move enum constant");
        assertDoesNotThrow(() -> Move.valueOf("SCISSORS"), "SCISSORS should be a valid Move enum constant");
    }

    @Test
    public void testRockBeatsScissors(){
        assertEquals(Result.WIN, Move.ROCK.compareWith(Move.SCISSORS));
    }

    @Test
    public void testScissorsBeatPaper() {
        assertEquals(Result.WIN, Move.SCISSORS.compareWith(Move.PAPER));
    }

    @Test
    public void testPaperBeatsRock() {
        assertEquals(Result.WIN, Move.PAPER.compareWith(Move.ROCK));
    }

    @Test
    public void testRockLosesToPaper() {
        assertEquals(Result.LOSE, Move.ROCK.compareWith(Move.PAPER));
    }

    @Test
    public void testPaperLosesToScissors() {
        assertEquals(Result.LOSE, Move.PAPER.compareWith(Move.SCISSORS));
    }

    @Test
    public void testScissorsLoseToRock() {
        assertEquals(Result.LOSE, Move.SCISSORS.compareWith(Move.ROCK));
    }

    @Test
    public void testSameMoveTies() {
        assertEquals(Result.TIE, Move.ROCK.compareWith(Move.ROCK));
        assertEquals(Result.TIE, Move.PAPER.compareWith(Move.PAPER));
        assertEquals(Result.TIE, Move.SCISSORS.compareWith(Move.SCISSORS));
    }

}
