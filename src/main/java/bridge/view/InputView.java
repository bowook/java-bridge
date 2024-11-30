package bridge.view;

import bridge.domain.constant.LengthCommand;
import bridge.utils.Parser;
import java.util.Scanner;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String INPUT_BRIDGE_LENGTH = "다리의 길이를 입력해주세요.";

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(INPUT_BRIDGE_LENGTH);
        return LengthCommand.from(Parser.toNumber(readConsole()));
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private String readConsole() {
        return scanner.nextLine();
    }
}
