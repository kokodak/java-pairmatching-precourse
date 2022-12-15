package pairmatching.util;

public class InputValidator {

    private static final String SELECT_KEY_ERROR = "[ERROR] 잘못된 기능을 선택하셨습니다.";

    public static String validateSelectKey(String input) throws IllegalArgumentException {
        if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("Q")) {
            throw new IllegalArgumentException(SELECT_KEY_ERROR);
        }
        return input;
    }
}
