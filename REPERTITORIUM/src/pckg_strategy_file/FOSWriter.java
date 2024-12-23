package pckg_strategy_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWriter implements WriteStrategy{
    @Override
    public void writeToFile(String content, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath), true)) {
            fos.write(content.getBytes());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
