import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HumanPlayerTest {
    //Field Declaration
    private HumanPlayer humanPlayer;
    private Scanner scanner;

    @BeforeEach
    public void setUp(){
        scanner = mock(Scanner.class);// Mocking the scanner object
        humanPlayer = new HumanPlayer(scanner); // new instance, passing mocking scanner
    }

    @Test
    public void testHumanPlayerChoosesRock(){
        when(scanner.nextLine()).thenReturn("ROCK");
        Move move = humanPlayer.chooseHumanPlayerMove();
        assertEquals(Move.ROCK, move);
    }
    @Test
    public void testHumanPlayerChoosesScissors(){
        when(scanner.nextLine()).thenReturn("SCISSORS");
        Move move = humanPlayer.chooseHumanPlayerMove();
        assertEquals(Move.SCISSORS,move);
    }
    @Test
    public void testHumanPlayerChoosesPaper(){
        when(scanner.nextLine()).thenReturn("PAPER");
        Move move = humanPlayer.chooseHumanPlayerMove();
        assertEquals(Move.PAPER, move);
    }

}
