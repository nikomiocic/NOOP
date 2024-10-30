package pckg_GUI_CALC;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private final List<String> txtData;


    public MainFrame(){
        super("Simple calculator");
        this.txtData = new ArrayList<>();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(680, 570);
        setVisible(true);


        initComps();
        layoutComps();
        activateMainFrame();
    }

    private void activateMainFrame() {
        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(CalculationFormData formRecord) {
                txtData.add(formRecord.toString());
            }
        });
        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccurred(String buttonActionString) {
                if (buttonActionString.equals("save text")){
                    SaveTextStrategy saveTextStrategy = new SaveTextStrategy();
                    saveTextStrategy.saveDataToFile("dataTXT.txt", txtData);
                }
                if (buttonActionString.equals("clear all")) {
                    ViewPanel.clearAll();
                    txtData.clear();
                    JOptionPane.showMessageDialog(MainFrame.this, "lista je obrisana", "Warring msg", JOptionPane.INFORMATION_MESSAGE );
                }
                if (buttonActionString.equals("load txt")){
                    LoadTxtStrategy loadTxtStrategy = new LoadTxtStrategy();
                    List<String> loaded = loadTxtStrategy.loadDataFromFile("dataTXT.txt");
                    for (String element : loaded){
                        viewPanel.addTextToViewPanel(element);
                    }
                    txtData.addAll(loaded);
                }
            }
        });

    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);

    }

    private void initComps() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
    }

}
