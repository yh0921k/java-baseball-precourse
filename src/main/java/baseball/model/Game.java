package baseball.model;

import baseball.constant.GameEnvironment;
import baseball.constant.GameStatus;
import java.util.List;

public class Game {
    private final RandomNumber randomNumber;
    private GameStatus status;

    public Game() {
        randomNumber = new RandomNumber();
        status = GameStatus.START;
    }

    public boolean isRunning() {
        return status == GameStatus.START;
    }

    public boolean isOver() {
        return status == GameStatus.END;
    }

    public void over() {
        status = GameStatus.END;
    }

    public GameCounter score(List<Integer> userList) {
        List<Integer> randomList = randomNumber.getRandomList();

        GameCounter counter = new GameCounter();
        counter.calculate(userList, randomList);

        checkGameOver(counter);
        return counter;
    }

    private void checkGameOver(GameCounter gameCounter) {
        if (gameCounter.getStrike() == GameEnvironment.NUMBER_SIZE) {
            over();
        }
    }
}