import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputerPlayerTest {
    // Create the instance of the class and store in a variable (Field Declarations)
    private ComputerPlayer computerPlayer;
    private Random random;

    //Set Up Method for Mockito
    @BeforeEach
    public void setUp(){
        random = mock(Random.class); //  Mocking the Random object, simulating its behavior for testing
        computerPlayer = new ComputerPlayer(random); // Creating a new instance of ComputerPlayer, passing the mocked Random object

    }

    @Test
    public void testComputerPlayerChoosesRock() {
        when(random.nextInt(3)).thenReturn(0); // Mock Random to always return 0 when nextInt(3) is called
        Move move = computerPlayer.chooseMove(); // Call the chooseMove() method, which will use the mocked Random object
        assertTrue(move == Move.ROCK); // Verify that the method returns ROCK when Random returns 0 that it was store in move
    }

    @Test
    public void testComputerPlayerChoosesPaper(){
        when(random.nextInt(3)).thenReturn(1);
        Move move = computerPlayer.chooseMove();
        assertTrue (move == Move.PAPER);
    }

    @Test
    public void testComputerPlayerChoosesScissors() {
        when(random.nextInt(3)).thenReturn(2);  // Mock Random to return 2
        Move move = computerPlayer.chooseMove();
        assertTrue(move == Move.SCISSORS);  // Verify that SCISSORS is chosen
    }




}
