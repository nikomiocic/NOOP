package pckg_strategy_file;

public class TestWriter {
    public static void main(String[] args) {
        ControllerContent controllerContent = new ControllerContent();
        String content = "neki string za upis u file \n novi red u file....";
        String filePath = "data/fst_file.txt";
        String additional = "This is something new!!";
 //       controllerContent.writeContentToFile(content, filePath);
        controllerContent.setWriteStrategy(new FOSWriter());
        controllerContent.writeContentToFile(additional, filePath);
//        controllerContent.readContentFromFile(filePath);
    }
}
