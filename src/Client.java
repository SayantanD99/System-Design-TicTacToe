import Controllers.GameController;
import Exceptions.InvalidBotCountException;
import Exceptions.InvalidMoveException;
import Exceptions.InvalidNumberOfPlayersException;
import Exceptions.SameSymbolException;
import Models.Game;
import Models.GameState;
import Models.Player;
import Models.Symbol;
import Strategies.winningstrategy.ColWinningStrategy;
import Strategies.winningstrategy.DiagonalRowWinningStrategy;
import Strategies.winningstrategy.GameWinningStrategy;
import Strategies.winningstrategy.RowWinningStrategy;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws InvalidBotCountException, InvalidNumberOfPlayersException, InvalidMoveException, SameSymbolException {
        GameController controller = new GameController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter game dimension");
        int dimension = scanner.nextInt();

        List<Player> players = List.of(
                new Player("Santa", new Symbol('X')),
                new Player("Klaus", new Symbol('O'))
        );
        List<GameWinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalRowWinningStrategy()
        );

        Game game = controller.startGame(dimension, players, winningStrategies);

        while (controller.getGameState(game).equals(GameState.IN_PROGRESS)) {
            controller.displayBoard(game);

            System.out.println("Do you want to undo ?");
            String moveType = scanner.next();

            if (moveType.equalsIgnoreCase("y")) {
                controller.undo(game);
                continue;
            }

            controller.makeMove(game);
        }

        //While loop will be over if the game has ENDED or game has DRAWN.
        System.out.println("Game finished");
        controller.displayBoard(game);
        if (controller.getGameState(game).equals(GameState.ENDED)) {
            System.out.println("Winner is " + controller.getWinner(game).getName());
        } else {
            System.out.println("Game DRAWN");
        }
    }
}
