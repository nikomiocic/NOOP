package pckg_GUI_CALC;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private static JTextArea area;
    private JScrollPane scrollPane;


    public ViewPanel(){
        area = new JTextArea();
        scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);


    }
    public  void addTextToViewPanel(String dataTxt){
        area.append(dataTxt + "/n");
    }

    public static void clearAll() {
        area.selectAll();
        area.replaceSelection(null);
    }
}
