package pckg_GUI_CALC;

import java.util.List;

public interface SaveDataStrategy<E> {

    void saveDataToFile(String filepath, List<E> data);
}
