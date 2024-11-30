package bridge.controller;

import bridge.exception.CustomException;
import bridge.view.InputView;
import bridge.view.OutputView;

public class BridgeController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BridgeGame bridgeGame;

    public BridgeController(final InputView inputView, final OutputView outputView, final BridgeGame bridgeGame) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.bridgeGame = bridgeGame;
    }

    public void start() {
        outputView.printStart();
        int bridgeLength = readBridgeLength();
    }

    private int readBridgeLength() {
        while (true) {
            try {
                return inputView.readBridgeSize();
            } catch (CustomException customException) {
                outputView.printErrorMessage(customException.getMessage());
            }
        }
    }
}
