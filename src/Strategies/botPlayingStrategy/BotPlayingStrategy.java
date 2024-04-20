package Strategies.botPlayingStrategy;

import Models.Board;
import Models.Move;
import Models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Player player, Board board);
}
