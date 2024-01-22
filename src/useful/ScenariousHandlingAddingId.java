package useful;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class ScenariousHandlingAddingId {

    public static void main(String[] args) {

    }

//    private static void addScenarioId(final Path path) {
//        LOG.add(path.toString() + "\n");
//        List<String> lines = new ArrayList<String>();
//        String line = null;
//        try {
//            File f1 = new File(path.toString());
//            FileReader fr = new FileReader(f1);
//            BufferedReader br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//                if (line.contains("Scenario Outline:")){
//                    line = line.replace("Scenario Outline:", format("Scenario Outline: %s", SCENARIO_ID));
//                    LOG.add(SCENARIO_ID + "\t" + line + "\n");
//                    SCENARIO_ID++;
//                }
//                if (line.contains("Scenario:")){
//                    line = line.replace("Scenario:", format("Scenario: %s", SCENARIO_ID));
//                    LOG.add(SCENARIO_ID + "\t" + line + "\n");
//                    SCENARIO_ID++;
//                }
//                lines.add(line);
//            }
//            fr.close();
//            br.close();
//            FileWriter fw = new FileWriter(f1);
//            BufferedWriter out = new BufferedWriter(fw);
//            for (String s : lines)
//                out.write(s+"\r\n");
//            out.flush();
//            out.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
}
