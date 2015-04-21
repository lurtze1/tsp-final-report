/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.tsp;

/**
 *
 * @author Gebruiker
 */
public class Path
{

    public int[] order;
    public double length;

    public Path(int numberOfPackets)
    {
        order = new int[numberOfPackets];
    }

    public void copy(Path path)
    {
        for (int i = 0; i < path.order.length; i++)
        {
            order[i] = path.order[i];
        }
        length = path.length;
    }
}
