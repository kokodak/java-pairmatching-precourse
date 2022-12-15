package pairmatching.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrewReader {

    private static final String FRONT_PATH = "src/main/resources/frontend-crew.md";
    private static final String BACK_PATH = "src/main/resources/backend-crew.md";

    public static List<String> getFrontNames() throws IOException {
        BufferedReader frontReader = new BufferedReader(new FileReader(FRONT_PATH));
        List<String> frontNames = new ArrayList<>();
        while (true) {
            String name = frontReader.readLine();
            if (name == null) {
                break;
            }
            frontNames.add(name);
        }
        return frontNames;
    }

    public static List<String> getBackNames() throws IOException {
        BufferedReader backReader = new BufferedReader(new FileReader(BACK_PATH));
        List<String> backNames = new ArrayList<>();
        while (true) {
            String name = backReader.readLine();
            if (name == null) {
                break;
            }
            backNames.add(name);
        }
        return backNames;
    }
}
