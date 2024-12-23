package pckg_macro;

import java.util.ArrayList;
import java.util.Collections;

public class MacroCmsFST implements Command{

    private final ArrayList<Command> commands;

    public MacroCmsFST(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void run() {
        if (commands.isEmpty()){
            System.out.println("there is nothing to run");
        }else{
            for (Command cmd : commands){
                cmd.run();
            }
        }
    }

    @Override
    public void undo() {
        Collections.reverse(commands);
        for (Command cmd : commands){
            cmd.undo();
        }
        Collections.reverse(commands);

    }
}
