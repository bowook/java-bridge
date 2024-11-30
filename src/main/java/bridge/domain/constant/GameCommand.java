package bridge.domain.constant;

import bridge.exception.CustomException;
import bridge.exception.ErrorMessage;
import java.util.Arrays;

public enum GameCommand {
    RETRY("R"),
    QUIT("Q");

    private final String gameCommand;

    GameCommand(final String gameCommand) {
        this.gameCommand = gameCommand;
    }

    public static GameCommand from(String input) {
        return Arrays.stream(GameCommand.values())
                .filter(command -> command.gameCommand.equals(input))
                .findAny()
                .orElseThrow(() -> CustomException.from(ErrorMessage.GAME_COMMAND_ERROR));
    }

    public String getGameCommand() {
        return gameCommand;
    }
}
