package pairmatching.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Mission {

    CAR_RACE("자동차경주", Level.LEVEL1),
    LOTTO("로또", Level.LEVEL1),
    NUMBER_BASEBALL("숫자야구", Level.LEVEL1),
    SHOPPING_BASKET("장바구니", Level.LEVEL2),
    PAYMENT("결제", Level.LEVEL2),
    SUBWAY_MAP("지하철노선도", Level.LEVEL2),
    PERFORMANCE("성능개선", Level.LEVEL4),
    DISTRIBUTE("배포", Level.LEVEL4);

    private static final String MISSION_ERROR = "[ERROR] 입력된 미션은 존재하지 않습니다.";
    private String name;
    private Level level;

    Mission(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public static Mission findByNameAndLevel(String name, Level level) {
        return Arrays.stream(values())
                .filter(mission -> mission.name.equals(name) && mission.level == level)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(MISSION_ERROR));
    }
}
