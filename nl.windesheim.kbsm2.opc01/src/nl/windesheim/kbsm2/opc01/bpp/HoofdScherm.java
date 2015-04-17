/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.bpp;

import javax.swing.*;

/**
 *
 * @author W7Home
 */
public class HoofdScherm extends JDialog {

    private JCheckBox firstFit;
    private JCheckBox bestFit;
    private JCheckBox decreasingOrder;

    public HoofdScherm() {
        JPanel panel = new JPanel();
        panel.setBorder( BorderFactory.createEmptyBorder( 10, 10, 10, 10 ) );
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);

        setTitle("Selectie menu BPP simulator");
        setSize(400, 400);

        //checkboxes
        firstFit = new JCheckBox();
        bestFit = new JCheckBox();
        decreasingOrder = new JCheckBox();

        //text
        JLabel a = new JLabel("Selecteer algoritmes");

        //layout
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
                        .addComponent(a)
                        .addComponent(firstFit)
                        .addComponent(bestFit)
                        .addComponent(decreasingOrder)
        );

        //settings
        setVisible(true);
    }
}
