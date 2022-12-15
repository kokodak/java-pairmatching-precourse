package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class PairMatching {

    public static List<String> makePair(List<String> crews) {
        return Randoms.shuffle(crews);
    }
}
