package bridge;

import bridge.controller.BridgeController;
import bridge.controller.BridgeGame;
import bridge.view.InputView;
import bridge.view.OutputView;

public class Application {

    public static void main(String[] args) {
        BridgeController bridgeController = new BridgeController(new InputView(), new OutputView(), new BridgeGame());
        bridgeController.start();
    }
}
