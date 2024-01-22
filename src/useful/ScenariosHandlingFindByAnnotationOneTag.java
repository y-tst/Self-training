package useful;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class ScenariosHandlingFindByAnnotationOneTag {

    public static void main(String[] args) throws IOException {
        String commonFolder = "/Users/Yurii_Yanchuk/IdeaProjects/work/CTC/cucumber-automation/src/main/resources/features";
        String annotation1 = "@sfsc";

        List<String> result = selectingScenariosByAnnotation(commonFolder, annotation1);
        result.forEach(System.out::println);
        System.out.println(result.size());
    }

    private static List<String> selectingScenariosByAnnotation(final String folderPath, final String annotation1) throws IOException {
        List<String> lines = new ArrayList<>();
        Set<String> allPaths = new HashSet<>();

        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {
            paths.filter(Files::isRegularFile)
                    .forEach(path -> {
                        try (BufferedReader reader = new BufferedReader(new FileReader(path.toString()))) {

                            String line;
                            int lineCount = 0;
                            Deque<String> priorLines = new ArrayDeque<>();

                            String firstLine = reader.readLine();

                            while ((line = reader.readLine()) != null) {
                                priorLines.addLast(line);
                                lineCount++;

                                if (line.contains("Scenario")) {
                                    boolean foundWord = checkPriorLines(priorLines, annotation1);
                                    if (foundWord) {
                                        allPaths.add(path.toString());
                                        if (!lines.contains(firstLine)) {
                                            lines.add("---->  " + firstLine);
                                        }
                                        lines.add(line);
                                    }

                                    priorLines.clear();
                                    lineCount = 0;
                                }

                                if (lineCount > 5) {
                                    priorLines.removeFirst();
                                    lineCount--;
                                }
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static boolean checkPriorLines(Deque<String> lines, String word) {
        boolean foundWord = false;
        int totalOccurrencesWord = 0;

        for (String line : lines) {
            if (line.contains(word)) {
                totalOccurrencesWord++;
                foundWord = true;
            }
        }

        return foundWord && totalOccurrencesWord == 1;
    }
}



