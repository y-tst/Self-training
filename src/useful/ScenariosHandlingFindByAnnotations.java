package useful;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class ScenariosHandlingFindByAnnotations {


    public static void main(String[] args) throws IOException {

        String commonFolder = "/Users/Yurii_Yanchuk/IdeaProjects/work/CTC/cucumber-automation/src/main/resources/features";
        String annotation1 = "@sfs";
        String annotation2 = "@ui";

        List<String> result = selectingScenariosByAnnotation(commonFolder, annotation1, annotation2);
        result.forEach(l -> System.out.println(l));
        System.out.println(result.size());
    }

    private static List<String> selectingScenariosByAnnotation(final String folderPath, final String annotation1, final String annotation2) throws IOException {
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
                                    boolean foundBothWords = checkPriorLines(priorLines, annotation1, annotation2);
                                    if (foundBothWords) {
                                        allPaths.add(path.toString());
                                        if (lines.contains(firstLine)) {

                                        }
                                        else{
                                            lines.add("---->  " + firstLine);
                                        }
                                        lines.add(line.toString());
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

    private static boolean checkPriorLines(Deque<String> lines, String word1, String word2) {
        boolean foundWord1 = false;
        boolean foundWord2 = false;
        int totalOccurrencesWord1 = 0;
        int totalOccurrencesWord2 = 0;

        for (String line : lines) {
            if (line.contains(word1)) {
                totalOccurrencesWord1++;
                foundWord1 = true;
            }
            if (line.contains(word2)) {
                totalOccurrencesWord2++;
                foundWord2 = true;
            }
        }

        return foundWord1 && foundWord2 && totalOccurrencesWord1 == 1 && totalOccurrencesWord2 == 1;
    }
}



