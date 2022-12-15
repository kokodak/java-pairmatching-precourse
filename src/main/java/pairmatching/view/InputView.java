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

    public static String getCourseLevelMission() {
        try {
            System.out.println("과정, 레벨, 미션을 선택하세요.");
            System.out.println("ex) 백엔드, 레벨1, 자동차경주");
            return InputValidator.validateCourseLevelMission(Console.readLine());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return getCourseLevelMission();
        }
    }

    public static String getRematchKey() {
        try {
            System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n" + "네 | 아니오");
            return InputValidator.validateRematchKey(Console.readLine());
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
            return getRematchKey();
        }
    }
}
