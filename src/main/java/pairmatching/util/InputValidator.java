package pairmatching.util;

import java.util.List;

public class InputValidator {

    private static final String INPUT_ERROR = "[ERROR] 잘못된 형식입니다.";

    public static String validateSelectKey(String input) throws IllegalArgumentException {
        if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("Q")) {
            throw new IllegalArgumentException(INPUT_ERROR);
        }
        return input;
    }

    public static String validateCourseLevelMission(String input) throws IllegalArgumentException {
        String[] split = input.split(", ");
        if (split.length != 3) {
            throw new IllegalArgumentException(INPUT_ERROR);
        }
        return input;
    }
}
