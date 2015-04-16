/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Gebruiker
 */
public class VisualScreen extends JFrame implements ActionListener
{
    private JRadioButton neighbour;
    private JRadioButton bruteforce;
    private JRadioButton genetic;  
    private JButton start;
    
    public VisualScreen(JFrame frame)
    {
        this.setVisible(true);
        this.setSize(800,800);
        this.setTitle("TSP Simulator");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        neighbour = new JRadioButton();
        bruteforce = new JRadioButton();
        genetic = new JRadioButton();
        start = new JButton("Start Simulatie");
        
        start.addActionListener(this);
        
        add(neighbour);
        add(bruteforce);
        add(genetic);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start)
        {
            
        }
    }
}
