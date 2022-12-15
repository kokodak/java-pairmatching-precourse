package pairmatching.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.io.IOException;
import java.util.List;
import pairmatching.domain.Course;

public class PairMaker {

    public static List<String> makePair(Course course) throws IOException {
        if (course == Course.BACKEND) {
            return Randoms.shuffle(CrewReader.getBackNames());
        }
        return Randoms.shuffle(CrewReader.getFrontNames());
    }
}
