package bridge.domain.constant;

import bridge.exception.CustomException;
import bridge.exception.ErrorMessage;

public enum LengthCommand {
    MIN(3),
    MAX(20);
    private final int length;

    LengthCommand(final int length) {
        this.length = length;
    }

    public static int from(int input) {
        if (input < MIN.length || input > MAX.length) {
            throw CustomException.from(ErrorMessage.INPUT_ERROR);
        }
        return input;
    }

    public int getLength() {
        return length;
    }
}
