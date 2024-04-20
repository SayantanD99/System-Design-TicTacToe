package Strategies.winningStrategy;

import Models.Board;
import Models.Move;
import Models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
