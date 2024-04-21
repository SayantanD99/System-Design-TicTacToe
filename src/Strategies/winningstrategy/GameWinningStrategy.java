package Strategies.winningstrategy;

import Models.Board;
import Models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
