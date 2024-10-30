package pckg_GUI_CALC;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadTxtStrategy implements LoadDataStrategy<String>{
    @Override
    public List<String> loadDataFromFile(String filePath) {
        List<String> loadData = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))){
            String line = null;
            while((line = br.readLine()) != null){
                loadData.add(line);
            }
            System.out.println("sve je ispisano iz: "+ filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadData;
    }
}
