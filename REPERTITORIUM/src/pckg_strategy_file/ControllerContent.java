package pckg_strategy_file;

public class ControllerContent {

    private WriteStrategy writeStrategy;
    private ReadStrategy readStrategy;

    public ControllerContent(){
        this.writeStrategy = new FileWriterStrategy();
        System.out.println("Defoult write strategy:" + writeStrategy.getClass().getSimpleName());
        this.readStrategy = new BRStrategy();
        System.out.println("Defoult read strategy: "+ readStrategy.getClass().getSimpleName());
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
        System.out.println("Write strategy set to :" + writeStrategy.getClass().getSimpleName());
    }

    public void writeContentToFile(String content, String filePath){
        if (writeStrategy != null){
            writeStrategy.writeToFile(content, filePath);
            System.out.println("content is written");
        }else{
            System.out.println("nema nista");
        }
    }
    public void readContentFromFile( String filePath){
        if (readStrategy != null){
            readStrategy.readFromFile(filePath);
            System.out.println("content is written");
        }
    }
}
