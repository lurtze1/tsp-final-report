package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Gebruiker
 */
public class SimulationResults extends JDialog implements ActionListener {

    private ArrayList<String> algorithmName;
    private ArrayList<Integer> time;
    private ArrayList<Integer> squaresTraveled;
    private int fieldX;
    private int fieldY;
    private JLabel algoritme, tijd, vakjes, veld;

    public SimulationResults(JFrame frame) {
        super(frame, true);
        //GroupLayout layout = new GroupLayout(this);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        setTitle("Options");
        setSize(400, 800);
        add(algoritme = new JLabel("algoritme"));
        add(tijd = new JLabel("tijd"));
        add(vakjes = new JLabel("vakjes"));
        add(veld = new JLabel("veld"));
        /**layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(algoritme)
                .addComponent(tijd)
                .addComponent(vakjes)
                .addComponent(veld));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(algoritme)
                        .addComponent(tijd)
                        .addComponent(vakjes)
                        .addComponent(veld))
        ); */
        

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
