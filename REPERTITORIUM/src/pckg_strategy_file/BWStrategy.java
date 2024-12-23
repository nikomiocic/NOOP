package pckg_strategy_file;

import java.io.*;

public class BWStrategy implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath), true))){
            bw.write(content);
            bw.write("\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
