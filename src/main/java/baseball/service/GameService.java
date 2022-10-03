package baseball.service;

import baseball.model.Game;
import baseball.model.GameCounter;
import baseball.util.DataConverter;
import java.util.List;

public class GameService {

    private Game game;

    public GameService() {
        reset();
    }

    public void reset() {
        game = new Game();
    }

    public boolean isRunning() {
        return game.isRunning();
    }

    public boolean isGameOver() {
        return game.isOver();
    }

    public GameCounter play(String input) {
        List<Integer> numbers = DataConverter.stringToIntegerList(input);
        return game.score(numbers);
    }
}