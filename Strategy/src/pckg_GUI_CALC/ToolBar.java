package pckg_GUI_CALC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    
    private JButton saveAsText;
    private JButton saveObjects;
    private JButton loadText;
    private JButton loadObjects;
    private JButton clearAll;
    private ToolBarListener toolBarListener;
    
    
    public ToolBar(){
        initComps();
        layoutComps();
        activateToolBar();
        
    }
    public void setToolBarListener(ToolBarListener toolBarListener){
        this.toolBarListener = toolBarListener;
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
        saveAsText.addActionListener(this);
        saveAsText.setActionCommand("save txt");
        saveObjects.addActionListener(this);
        saveObjects.setActionCommand("save bin");
        loadObjects.addActionListener(this);
        loadObjects.setActionCommand("load bin");
        loadText.addActionListener(this);
        loadText.setActionCommand("load txt");
        clearAll.addActionListener(this);
        clearAll.setActionCommand("clear all");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ( ae.getSource() == saveAsText){
            System.out.println("clicked: " + saveAsText.getActionCommand());
            if (toolBarListener != null){
                toolBarListener.toolBarEventOccurred(saveAsText.getActionCommand());
            }
        }
        if ( ae.getSource() == clearAll){
            System.out.println("clicked: " + saveObjects.getActionCommand());
            if (toolBarListener != null){
                toolBarListener.toolBarEventOccurred(clearAll.getActionCommand());
            }
        }
        if ( ae.getSource() == loadText){
            System.out.println("clicked: " + loadText.getActionCommand());
            if (toolBarListener != null){
                toolBarListener.toolBarEventOccurred(loadText.getActionCommand());
            }
        }
        if ( ae.getSource() == loadObjects){
            System.out.println("clicked: " + loadObjects.getActionCommand());
        }
        if ( ae.getSource() == clearAll){
            System.out.println("clicked: " + clearAll.getActionCommand());
        }


    }
}
