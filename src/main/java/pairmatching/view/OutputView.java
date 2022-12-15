package pairmatching.view;

import java.util.List;

public class OutputView {

    private static final String TWO_PEOPLE = "%s : %s";
    private static final String THREE_PEOPLE = "%s : %s : %s";
    private static final String PAIR_MATCHING_INITIALIZATION = "초기화 되었습니다.";

    public static void printCourseInformation() {
        System.out.println("#############################################");
        System.out.println("과정: 백엔드 | 프론트엔드");
        System.out.println("미션:");
        System.out.println("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임");
        System.out.println("  - 레벨2: 장바구니 | 결제 | 지하철노선도");
        System.out.println("  - 레벨3: ");
        System.out.println("  - 레벨4: 성능개선 | 배포");
        System.out.println("  - 레벨5: ");
        System.out.println("############################################");
    }

    public static void printPairMatchingResult(List<String> pair) {
        if (pair.size() % 2 == 0) {
            printPairMatchingResultForEven(pair);
            return;
        }
        printPairMatchingResultForOdd(pair);
    }

    private static void printPairMatchingResultForEven(List<String> pair) {
        for (int i = 0; i < pair.size() / 2; i += 2) {
            System.out.printf(TWO_PEOPLE, pair.get(i), pair.get(i + 1));
        }
    }

    private static void printPairMatchingResultForOdd(List<String> pair) {
        for (int i = 0; (int) i < pair.size() / 2 - 1; i += 2) {
            System.out.printf(TWO_PEOPLE, pair.get(i), pair.get(i + 1));
        }
        int startIndex = pair.size() - 3;
        System.out.printf(THREE_PEOPLE, pair.get(startIndex), pair.get(startIndex + 1), pair.get(startIndex + 2));
    }

    public static void printPairMatchingInitialization() {
        System.out.println(PAIR_MATCHING_INITIALIZATION);
    }
}
