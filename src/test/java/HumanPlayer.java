import java.util.Scanner;

public class HumanPlayer {

    private final Scanner scanner;

    //Constructor
    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    public Move chooseHumanPlayerMove() {
        String choice = scanner.nextLine().toUpperCase();
        switch (choice){
            case "ROCK":
                return Move.ROCK;
            case "PAPER":
                return Move.PAPER;
            case "SCISSORS":
                return Move.SCISSORS;
            default:
                throw new IllegalArgumentException("Invalid move: " + choice);

        }
    }
}
