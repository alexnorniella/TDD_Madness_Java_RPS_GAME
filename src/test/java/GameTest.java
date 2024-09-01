import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;
    private HumanPlayer humanPlayer;
    private ComputerPlayer computerPlayer;

    @BeforeEach
    public void setUp(){
        humanPlayer = mock(HumanPlayer.class);
        computerPlayer = mock(ComputerPlayer.class);
        game = new Game(humanPlayer,computerPlayer);
    }

    @Test
    public void testHumanWins(){
        when(humanPlayer.chooseHumanPlayerMove()).thenReturn(Move.ROCK);
        when(computerPlayer.chooseMove()).thenReturn(Move.SCISSORS);
        String result = game.playRound();
        assertEquals("Human wins!", result);
    }

    @Test
    public void testComputerWins(){
        when(computerPlayer.chooseMove()).thenReturn(Move.SCISSORS);
        when(humanPlayer.chooseHumanPlayerMove()).thenReturn(Move.PAPER);
        String result = game.playRound();
        assertEquals("RD2 Computer wins", result);
    }

    @Test
    public void testTie(){
        // Mocking Moves
        when(humanPlayer.chooseHumanPlayerMove()).thenReturn(Move.PAPER);
        when(computerPlayer.chooseMove()).thenReturn(Move.PAPER);
        String result = game.playRound();
        assertEquals("Bloody Nora, It is a tie", result);

    }





}
