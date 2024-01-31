package baseball;

import baseball.model.*;
import baseball.model.Number;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Game {

    private final Number answer;

    private boolean isOngoing = true;
    private Command command;

    public Game() {
        this.answer = AnswerMaker.make();
    }

    public void play() {
        int value = InputView.readNumber();
        Number number = new Number(value);
        Result result = Referee.call(answer, number);
        OutputView.printResult(result);

        if (result.isGameOver()) {
            this.isOngoing = false;
        }
    }

    public void readCommand() {
        int value = InputView.readCommand();
        command = new Command(value);
    }

    public boolean isReplay() {
        return command.isReplay();
    }

    public boolean isOngoing() {
        return isOngoing;
    }
}
