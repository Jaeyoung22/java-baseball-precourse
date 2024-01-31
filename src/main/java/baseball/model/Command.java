package baseball.model;

import java.util.Objects;

public class Command {

    private static final String VALIDATION_ERROR_MESSAGE = "1,2 중 입력해주세요.";
    private static final int REPLAY_COMMAND = 1;
    private static final int STOP_COMMAND = 2;

    private final int value;

    public Command(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (value != REPLAY_COMMAND && value != STOP_COMMAND) {
            throw new IllegalArgumentException(VALIDATION_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return value == command.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public boolean isReplay() {
        return value == REPLAY_COMMAND;
    }
}
