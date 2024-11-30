package bridge.domain.constant;

import bridge.exception.CustomException;
import bridge.exception.ErrorMessage;
import java.util.Arrays;

public enum MoveCommand {
    UP("U"),
    DOWN("D");
    private final String moveCommand;

    MoveCommand(final String moveCommand) {
        this.moveCommand = moveCommand;
    }

    public static MoveCommand from(String input) {
        return Arrays.stream(MoveCommand.values())
                .filter(command -> command.moveCommand.equals(input))
                .findAny()
                .orElseThrow(() -> CustomException.from(ErrorMessage.MOVE_COMMAND_ERROR));
    }

    public String getMoveCommand() {
        return moveCommand;
    }
}
