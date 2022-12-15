package pairmatching.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level {

    private final Map<String, List<String>> missionPair;

    private Level(Map<String, List<String>> missionPair) {
        this.missionPair = missionPair;
    }

    public static Level getLevel1() {
        Map<String, List<String>> missionPair = new HashMap<>();
        missionPair.put("자동차경주", new ArrayList<>());
        missionPair.put("로또", new ArrayList<>());
        missionPair.put("숫자야구게임", new ArrayList<>());
        return new Level(missionPair);
    }

    public static Level getLevel2() {
        Map<String, List<String>> missionPair = new HashMap<>();
        missionPair.put("장바구니", new ArrayList<>());
        missionPair.put("결제", new ArrayList<>());
        missionPair.put("지하철노선도", new ArrayList<>());
        return new Level(missionPair);
    }

    public static Level getLevel3() {
        Map<String, List<String>> missionPair = new HashMap<>();
        return new Level(missionPair);
    }

    public static Level getLevel4() {
        Map<String, List<String>> missionPair = new HashMap<>();
        missionPair.put("성능개선", new ArrayList<>());
        missionPair.put("배포", new ArrayList<>());
        return new Level(missionPair);
    }

    public static Level getLevel5() {
        Map<String, List<String>> missionPair = new HashMap<>();
        return new Level(missionPair);
    }

    public void setPairMatching(String mission, List<String> pair) {
        missionPair.replace(mission, pair);
    }

    public boolean isUnmatched(String mission) {
        return missionPair.get(mission).isEmpty();
    }
}
