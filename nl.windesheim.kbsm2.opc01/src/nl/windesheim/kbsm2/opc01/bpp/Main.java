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
public class Main {
    
    public static void main (String[] args){
        HoofdScherm b = new HoofdScherm();
        b.pack();
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
