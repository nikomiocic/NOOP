package pckg_GUI_CALC;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveTextStrategy implements SaveDataStrategy<String> {

    @Override
    public void saveDataToFile(String filepath, List<String> data) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filepath)))) {
            for (String el : data){
                bw.write(el);
                bw.newLine();
            }
            System.out.println("data written as txt in:" + filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
