package pckg_GUI_CALC;

import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea area;
    private JScrollPane scrollPane;


    public ViewPanel(){
        area = new JTextArea();
        scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);


    }
}
