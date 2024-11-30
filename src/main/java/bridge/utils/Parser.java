package bridge.utils;

import bridge.exception.CustomException;
import bridge.exception.ErrorMessage;

public class Parser {
    public static int toNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            throw CustomException.from(ErrorMessage.INPUT_FORMAT_ERROR);
        }
    }
}
