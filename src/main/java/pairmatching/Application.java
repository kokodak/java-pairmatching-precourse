package pairmatching;

import java.io.IOException;
import pairmatching.controller.PairMatchingController;

public class Application {
    public static void main(String[] args) throws IOException {
        // TODO 구현 진행

        PairMatchingController pairMatchingController = new PairMatchingController();
        pairMatchingController.run();
    }
}
