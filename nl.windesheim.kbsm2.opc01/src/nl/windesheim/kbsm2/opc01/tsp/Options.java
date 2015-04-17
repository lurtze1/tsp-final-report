package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Options extends JDialog implements ActionListener
{
    private int height;
    private int width;
    private String[] getallen = { "1","2","3","4","5","6","7","8","9" };
    private JButton maak;
    private JComboBox grootte1 = new JComboBox(getallen);
    private JComboBox grootte2 = new JComboBox(getallen);

    public Options(JFrame frame)
    {
        super(frame,true);
        setSize(400,400);        
        setTitle("Instellingen");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        
        maak = new JButton("Maak aan");
        
        add(grootte1);
        add(grootte2);
        add(maak);
        
        setVisible(true);        
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
        
}
