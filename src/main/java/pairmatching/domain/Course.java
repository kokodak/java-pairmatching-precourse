package pairmatching.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {

    private List<Level> levels;
    private List<String> crews;

    public Course(List<String> crews) {
        this.crews = crews;
        levels = new ArrayList<>();
        levels.add(Level.getLevel1());
        levels.add(Level.getLevel2());
        levels.add(Level.getLevel3());
        levels.add(Level.getLevel4());
        levels.add(Level.getLevel5());
    }

    public List<Level> getLevels() {
        return Collections.unmodifiableList(levels);
    }

    public List<String> getCrews() {
        return Collections.unmodifiableList(crews);
    }
}
