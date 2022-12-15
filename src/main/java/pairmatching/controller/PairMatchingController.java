package pairmatching.controller;

import java.io.IOException;
import java.util.List;
import pairmatching.domain.Course;
import pairmatching.domain.Level;
import pairmatching.domain.Mission;
import pairmatching.domain.PairMatchingHistory;
import pairmatching.util.PairMaker;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {

    PairMatchingHistory pairMatchingHistory;

    public PairMatchingController() {
        pairMatchingHistory = new PairMatchingHistory();
    }

    public void run() {
        while (true) {
            String selectKey = InputView.getSelectKey();
            if (selectKey.equals("1")) {
                one();
            }
            if (selectKey.equals("2")) {
                two();
            }
            if (selectKey.equals("3")) {
                OutputView.printPairMatchingInitialization();
                pairMatchingHistory.initializeHistory();
            }
            if (selectKey.equals("Q")) {
                break;
            }
        }
    }

    private void one() {
        try {
            OutputView.printCourseLevelMission();
            String input = InputView.getCourseLevelMission();
            String[] split = input.split(", ");
            Course course = Course.findByName(split[0]);
            Level level = Level.findByName(split[1]);
            Mission mission = Mission.findByNameAndLevel(split[2], level);
            List<String> pair = PairMaker.makePair(course);
            setHistory(course, mission, pair);
        } catch (IllegalArgumentException | IOException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            one();
        }
    }

    private void two() {
        try {
            OutputView.printCourseLevelMission();
            String input = InputView.getCourseLevelMission();
            String[] split = input.split(", ");
            Course course = Course.findByName(split[0]);
            Level level = Level.findByName(split[1]);
            Mission mission = Mission.findByNameAndLevel(split[2], level);
            List<String> pair = pairMatchingHistory.getHistory(course, mission);
            OutputView.printPairMatchingResult(pair);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            two();
        }
    }

    private void setHistory(Course course, Mission mission, List<String> pair) {
        if (pairMatchingHistory.isHistoryEmpty(course, mission)) {
            pairMatchingHistory.setHistory(course, mission, pair);
            OutputView.printPairMatchingResult(pair);
            return;
        }
        String input = InputView.getRematchKey();
        if (input.equals("네")) {
            pairMatchingHistory.setHistory(course, mission, pair);
            OutputView.printPairMatchingResult(pair);
        }
    }
}
