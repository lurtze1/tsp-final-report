/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Gebruiker
 */
public class SimulationResults extends JDialog implements ActionListener
{

    private ArrayList<String> algorithmName;
    private ArrayList<Integer> time;
    private ArrayList<Integer> squaresTraveled;
    private int fieldX;
    private int fieldY;
    private JLabel algoritme, tijd, vakjes, veld;

    public SimulationResults(JFrame frame)
    {
        super(frame, true);
        setTitle("Options");
        setSize(400, 800);
        add(algoritme = new JLabel("algoritme"));
        add(tijd = new JLabel("tijd"));
        add(vakjes = new JLabel("vakjes"));
        add(veld = new JLabel("veld"));
    }

    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
