public class Game {
    
    private final HumanPlayer  humanPlayer;
    private final ComputerPlayer computerPlayer;
    
    
    public Game(HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    public String playRound() {
        Move humanMove = humanPlayer.chooseHumanPlayerMove();
        Move computerMove = computerPlayer.chooseMove();
        return determineWinner (humanMove, computerMove);
    }

    private String determineWinner(Move humanMove, Move computerMove) {
        if(humanMove == computerMove){
            return "Bloody Nora, It is a tie";
        } else if ((humanMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                (humanMove == Move.PAPER && computerMove == Move.ROCK) ||
                (humanMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            return "Human wins!";
        } else{
            return "RD2 Computer wins";
        }
    }
}
