package pckg_GUI_CALC;

import javax.swing.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;


    public MainFrame(){
        super("Simple calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);


        initComps();
        layoutComps();
        actuvateMainFrame();
    }

    private void actuvateMainFrame() {
    }

    private void layoutComps() {

    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
    }

}
