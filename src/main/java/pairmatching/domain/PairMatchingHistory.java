package pairmatching.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class PairMatchingHistory {

    Map<Mission, List<String>> backendHistory;
    Map<Mission, List<String>> frontendHistory;

    public PairMatchingHistory() {
        backendHistory = new EnumMap<>(Mission.class);
        frontendHistory = new EnumMap<>(Mission.class);
        Arrays.stream(Mission.values()).forEach(mission -> backendHistory.put(mission, new ArrayList<>()));
        Arrays.stream(Mission.values()).forEach(mission -> frontendHistory.put(mission, new ArrayList<>()));
    }

    public void setHistory(Course course, Mission mission, List<String> pair) {
        if (course == Course.BACKEND) {
            setBackendHistory(mission, pair);
        }
        if (course == Course.FRONTEND) {
            setFrontendHistory(mission, pair);
        }
    }

    private void setBackendHistory(Mission mission, List<String> pair) {
        backendHistory.replace(mission, pair);
    }

    private void setFrontendHistory(Mission mission, List<String> pair) {
        frontendHistory.replace(mission, pair);
    }

    public boolean isHistoryEmpty(Course course, Mission mission) {
        if (course == Course.BACKEND) {
            return isBackendHistoryEmpty(mission);
        }
        return isFrontendHistoryEmpty(mission);
    }

    private boolean isBackendHistoryEmpty(Mission mission) {
        return backendHistory.get(mission).isEmpty();
    }

    private boolean isFrontendHistoryEmpty(Mission mission) {
        return frontendHistory.get(mission).isEmpty();
    }

    public List<String> getHistory(Course course, Mission mission) {
        if (course == Course.BACKEND) {
            return getBackendHistory(mission);
        }
        return getFrontendHistory(mission);
    }

    private List<String> getBackendHistory(Mission mission) {
        return backendHistory.get(mission);
    }

    private List<String> getFrontendHistory(Mission mission) {
        return frontendHistory.get(mission);
    }

    public void initializeHistory() {
        backendHistory = new EnumMap<>(Mission.class);
        frontendHistory = new EnumMap<>(Mission.class);
        Arrays.stream(Mission.values()).forEach(mission -> backendHistory.put(mission, new ArrayList<>()));
        Arrays.stream(Mission.values()).forEach(mission -> frontendHistory.put(mission, new ArrayList<>()));
    }
}
