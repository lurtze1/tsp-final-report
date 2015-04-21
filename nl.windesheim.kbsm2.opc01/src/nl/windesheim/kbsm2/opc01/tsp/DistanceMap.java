/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.tsp;

import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public class DistanceMap
{

    double[][] map;

    public DistanceMap()
    {

    }

    public void createMatrix(ArrayList<Packet> packets)
    {
        double[][] map = new double[packets.size()][packets.size()];
        for (int i = 0; i < packets.size(); i++)
        {
            for (int j = 0; j < packets.size(); j++)
            {
                map[i][j] = packets.get(i).distance(packets.get(j));
            }
        }
        for (int i = 0; i < packets.size(); i++)
        {
            for (int j = 0; j < packets.size(); j++)
            {
                if (map[i][j] == 1 && map[j][i] == 0)
                {
                    map[j][i] = 1;
                }
            }
        }
        this.map = map;
    }

    public double[][] getMap()
    {
        return map;
    }

    public void setMap(double[][] map)
    {
        this.map = map;
    }

}
