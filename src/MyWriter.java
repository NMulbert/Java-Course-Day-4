import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyWriter {
    public static void writeFile(ArrayList<String> lines, String outputFilePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        for (String line: lines) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}
