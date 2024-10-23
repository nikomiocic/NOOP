package pckg_GUI_CALC;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SavetextStrategy implements SaveDataStrategy {
    @Override
    public <E> void saveDataToFile(String filepath, List<E> data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filepath)))) {
            for (E elements : data){
                bw.write((String) elements);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
