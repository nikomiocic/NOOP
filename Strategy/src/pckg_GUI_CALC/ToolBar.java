package pckg_GUI_CALC;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JPanel {
    
    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    
    
    public ToolBar(){
        initComps();
        layoutComps();
        activateToolBar();
        
    }

    private void initComps() {
        this.saveAsText = new JButton("save text");
        this.saveObjects = new JButton("saveObjects");
        this.loadObjects = new JButton("loadObjects");
        this.loadText = new JButton("loadText");
        this.clearAll = new JButton("clearAll");
    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(saveAsText);
        add(saveObjects);
        add(loadObjects);
        add(loadText);
        add(clearAll);
    }

    private void activateToolBar() {
    }
}
