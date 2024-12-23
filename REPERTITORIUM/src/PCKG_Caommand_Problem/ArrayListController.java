package PCKG_Caommand_Problem;

import java.util.Stack;

public class ArrayListController {

    private Stack<Command> undoStack;
    private Stack<Command> redoStack;
    private Command currentCommand;

    public ArrayListController() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void setCommand(Command cmd){
        this.currentCommand = cmd;
    }

    public void runCommand(){
        if (currentCommand != null){
            currentCommand.runCommand();
            undoStack.push(currentCommand);
        } else {
            System.out.println("Set some command on list!");
        }
        listUndoStack();
        listRedoStack();
    }

    public void undoCommand(){
        if (undoStack.isEmpty()){
            System.out.println("Nothing to undo - undo stack is empty!");
        } else {
            currentCommand = undoStack.pop();  // get last command from undoStack
            currentCommand.undoCommand();
            redoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    public void redoCommand(){
        if (redoStack.isEmpty()){
            System.out.println("Nothing to redo - redo stack is empty!");
        } else {
            currentCommand = redoStack.pop();
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if (undoStack.isEmpty()){
            System.out.println("Nothing to list from undo stack - it is empty!");
        } else {
            System.out.println("\n=========================== Undo stack ============================");
            for (Command cmd : undoStack){
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack(){
        if (redoStack.isEmpty()){
            System.out.println("Nothing to list from redo stack - it is empty!");
        } else {
            System.out.println("\n=========================== Redo stack ============================");
            for (Command cmd : redoStack){
                System.out.println(cmd);
            }
        }
    }
}