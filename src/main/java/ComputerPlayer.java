import java.util.Random;

public class ComputerPlayer {
    // Stores Random object, doesn't create it or initialise-place holder
    private final Random random;

    //Constructor initialise the random field
    public ComputerPlayer(Random random) {
        // assigns Random object to the field declaration
        this.random = random;
    }

    // Returning a Move value from enum class
    // Method to choose a move
    public Move chooseMove() {
        //Random instance, which was initialised in the constructor,
        // is now being used to generate this random number.
        int choice = random.nextInt(3);  // Generate a random number between 0 and 2
        switch (choice) {
            case 0:
                return Move.ROCK;
            case 1:
                return Move.PAPER;
            case 2:
                return Move.SCISSORS;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
