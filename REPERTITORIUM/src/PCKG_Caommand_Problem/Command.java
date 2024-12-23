package PCKG_Caommand_Problem;

public interface Command<E> {

    void runCommand();
    void undoCommand();
}
