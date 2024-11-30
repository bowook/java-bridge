package bridge.exception;

public enum ErrorMessage {
    INPUT_ERROR("3 이상 20 이하의 숫자를 입력하셔야 합니다."),
    INPUT_FORMAT_ERROR("숫자를 입력하셔야 합니다."),
    GAME_COMMAND_ERROR("R(재시작)과 Q(종료) 중 하나의 문자를 입력하셔야 합니다."),
    MOVE_COMMAND_ERROR("U(위 칸)와 D(아래 칸) 중 하나의 문자를 입력하셔야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}