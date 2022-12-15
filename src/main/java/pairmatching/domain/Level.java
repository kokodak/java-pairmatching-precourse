package pairmatching.domain;

import java.util.Arrays;

public enum Level {

    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private static final String LEVEL_ERROR = "[ERROR] 입력된 레벨은 존재하지 않습니다.";
    private String name;

    Level(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Level findByName(String name) {
        return Arrays.stream(values())
                .filter(level -> level.name.equals(name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(LEVEL_ERROR));
    }
}
