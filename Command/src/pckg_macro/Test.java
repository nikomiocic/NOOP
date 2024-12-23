package pckg_macro;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        GarageDoorOpen gdo = new GarageDoorOpen();
        GarageLightOn glo = new GarageLightOn();
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(gdo);
        commands.add(glo);

        MacroCmsFST macro = new MacroCmsFST(commands);
        macro.run();
        macro.undo();
        macro.run();
    }
}
