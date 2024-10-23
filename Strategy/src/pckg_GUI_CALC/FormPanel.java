package pckg_GUI_CALC;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {
    private JTextField firstNumber;
    private JTextField secNumber;
    private JTextField resultNumber;

    private JComboBox<CalculationStrategy> operationBox;
    private JButton submitButt;
    private FormPanelListener formPanelListener;

    public FormPanel(){
        Dimension dimension = getPreferredSize();
        dimension.height=220;
        setPreferredSize(dimension);
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Calculator Panel");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        initComps();
        layoutComps();
        activateFormPanel();
    }

    private void initComps() {

        firstNumber = new JTextField(10);
        secNumber = new JTextField(10);
        resultNumber = new JTextField(10);

        operationBox = new JComboBox<>();

        DefaultComboBoxModel<CalculationStrategy> operationBoxModel = new DefaultComboBoxModel<>();
        operationBoxModel.addElement(new AddCalcStrategy());
        operationBoxModel.addElement(new SubCalcStrategy());
        operationBoxModel.addElement(new MultyCalcStrategy());
        operationBoxModel.addElement(new DivCalcStrategy());
        operationBox.setModel(operationBoxModel);

        operationBox.setSelectedIndex(-1);

        submitButt = new JButton("Calculate");

    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("First Number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(firstNumber, gbc);

        gbc.gridx = 0;
        gbc.gridy++;

        add(Box.createVerticalStrut(15), gbc);
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Second number: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(secNumber, gbc);

        gbc.gridx++;
        add(Box.createHorizontalStrut(25), gbc);
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Choose Config: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(operationBox, gbc);

        gbc.gridx= 0;
        gbc.gridy++;
        add(Box.createVerticalStrut(20), gbc);
        gbc.gridy++;
        add(submitButt, gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Resoult: "), gbc);

        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(resultNumber, gbc);

    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void activateFormPanel() {
        submitButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fst = Double.parseDouble(firstNumber.getText());
                double sec = Double.parseDouble(firstNumber.getText());
//                CalculationStrategy calculationStrategy = (CalculationStrategy) operationBox.setSelectedItem();
//                double resoult = calculationStrategy.performCalculation(fst, sec);
//                resultNumber.setText(String.valueOf(resoult));
//                if (formPanelListener != null){
//                    formPanelListener.formPanelEventOccurred(calculationRecord);
//                    resetForm();
//                }
            }
        });


    }
    private void resetForm(){
        firstNumber.setText("");
        secNumber.setText("");
        resultNumber.setEnabled(false);
        firstNumber.requestFocus();
        operationBox.setSelectedIndex(-1);
    }

}
