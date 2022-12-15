package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.InputValidator;

public class InputView {

    public static String getSelectKey() {
        try {
            System.out.println("1. 페어 매칭");
            System.out.println("2. 페어 조회");
            System.out.println("3. 페어 초기화");
            System.out.println("Q. 종료");
            return InputValidator.validateSelectKey(Console.readLine());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return getSelectKey();
        }
    }
}
