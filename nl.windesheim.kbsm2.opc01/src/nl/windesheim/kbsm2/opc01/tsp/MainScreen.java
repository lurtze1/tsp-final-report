package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MainScreen extends JFrame implements ActionListener
{
    private JRadioButton neighbour;
    private JRadioButton bruteforce;
    private JRadioButton genetic;
    private JLabel neighbour2;
    private JLabel bruteforce2;
    private JLabel genetic2;
    private JButton start;

    private ArrayList<Packet> selectedPackets;
    private int adjacencyMatrix[][];

    public MainScreen()
    {
        this.setVisible(true);
        this.setSize(800, 800);
        this.setTitle("TSP Simulator");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        neighbour = new JRadioButton();
        neighbour2 = new JLabel();        
        bruteforce = new JRadioButton();
        bruteforce2 = new JLabel();
        genetic = new JRadioButton();
        genetic2 = new JLabel();
        start = new JButton("Start Simulatie");

        start.addActionListener(this);

        add(neighbour);
        add(bruteforce);
        add(genetic);
        add(start);
    }

    public void getSelectedPackets()
    {

    }

    public void createAdjecencyMatrix()
    {

    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start)
        {
            
        }
    }
}
