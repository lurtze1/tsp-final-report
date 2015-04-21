package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Options extends JDialog implements ActionListener
{    
    private String[] getallen = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20" };    
    private JComboBox grootte1 = new JComboBox(getallen);
    private JComboBox grootte2 = new JComboBox(getallen);    
    private JButton maak;    

    public Options(JFrame frame)
    {
        super(frame,true);
        
        setSize(400,400);        
        setTitle("Instellingen");        
        setLayout(new FlowLayout());        
        
        maak = new JButton("Maak aan");
        grootte1 = new JComboBox(getallen);
        grootte2= new JComboBox(getallen);
        
        add(grootte1);
        add(grootte2);
        add(maak);
        
        maak.addActionListener(this);
        
        setVisible(true);        
    }    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        setVisible(false);
        String heightstr = grootte1.getSelectedItem().toString();
        String widthstr = grootte2.getSelectedItem().toString();
        int height = Integer.parseInt(heightstr);
        int width = Integer.parseInt(widthstr);
    }
        
}
