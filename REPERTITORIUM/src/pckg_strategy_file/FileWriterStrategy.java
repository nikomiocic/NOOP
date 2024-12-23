package pckg_strategy_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStrategy implements WriteStrategy {
    @Override
    public void writeToFile(String content, String filePath) {
        try (FileWriter fw = new FileWriter(new File(filePath), true)) {
            fw.write(content);
            fw.write(System.lineSeparator());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}