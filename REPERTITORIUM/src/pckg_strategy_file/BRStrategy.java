package pckg_strategy_file;

import java.io.*;

public class BRStrategy implements ReadStrategy{
    @Override
    public void readFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            String line="";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
