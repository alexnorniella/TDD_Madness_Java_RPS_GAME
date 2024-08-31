public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    // Method in the Move enum that returns a Result enum value
    // compareWith method compares two instances
    public Result compareWith(Move otherMove) {
        if (this == otherMove) {
            return Result.TIE;
        }
        if((this == ROCK && otherMove== SCISSORS) ||
                (this == PAPER && otherMove == ROCK) ||
                (this == SCISSORS && otherMove == PAPER)){
            return Result.WIN;
        } else {
            return Result.LOSE;
        }
    }

}
