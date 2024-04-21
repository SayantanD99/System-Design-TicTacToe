package Controllers;

import Exceptions.InvalidBotCountException;
import Exceptions.InvalidMoveException;
import Exceptions.InvalidNumberOfPlayersException;
import Exceptions.SameSymbolException;
import Models.Game;
import Models.GameState;
import Models.Player;
import Strategies.winningstrategy.GameWinningStrategy;

import java.util.List;

public class GameController {
    //In the Controller class, we'll write all the methods which client needs from our System.
    public Game startGame(int dimension, List<Player> players, List<GameWinningStrategy> winningStrategies) throws InvalidBotCountException, InvalidNumberOfPlayersException, SameSymbolException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void undo(Game game) {
        game.undo();
    }

    public void displayBoard(Game game) {
        game.getBoard().displayBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinnner();
    }
}
