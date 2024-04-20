package Controller;

import Models.Game;
import Models.GameState;
import Models.Move;
import Models.Player;
import Strategies.winningStrategy.WinningStrategy;
import Strategies.winningStrategy.WinningStrategyFactory;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players){
        try{
            return Game.builder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .setWinningStrategies(List.of(WinningStrategyFactory.getWinningStrategy(dimension)))
                    .build();
        }catch (Exception e){
            System.out.println("Could not start the game, something went wrong");
        }
        return null;
    }

    public void displayBoard(Game game){
        game.getBoard().printBoard();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public Move executeMove(Game game, Player player){
        Move move = player.makeMove(game.getBoard());
        updateGameMoves(game, move);
        return move;
    }

    private void updateGameMoves(Game game, Move move){
        game.getMoves().add(move);
    }

    public Player checkWinner(Game game, Move recentMove){
        for(WinningStrategy winningStrategy : game.getWinningStrategies()){
            Player player = winningStrategy.checkWinner(game.getBoard(), recentMove);
            if(player != null)
                return player;
        }
        return null;
    }

    public String getWinner(Game game){
        return game.getWinner().getName();
    }
}
