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
public class HoofdScherm extends JFrame{
    
    private JCheckBox firstFit;
    private JCheckBox bestFit;
    private JCheckBox decreasingOrder;
    
    public HoofdScherm(){
        setTitle("Selectie menu BPP simulator");
        setSize(400, 400);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        //checkboxes
        firstFit = new JCheckBox();
        bestFit = new JCheckBox();
        decreasingOrder = new JCheckBox();
        
        //text
        JLabel a = new JLabel("Selecteer algoritmes");
        
        //add
        add(a);
        add(firstFit);
        add(bestFit);
        add(decreasingOrder);
        
        //settings
        setVisible(true);
    }
}
