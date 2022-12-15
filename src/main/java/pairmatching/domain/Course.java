package pairmatching.domain;

import java.util.Arrays;

public enum Course {

    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private static final String COURSE_ERROR = "[ERROR] 입력된 과정은 존재하지 않습니다.";
    private final String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Course findByName(String name) {
        return Arrays.stream(values())
                .filter(course -> course.name.equals(name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(COURSE_ERROR));
    }
}
