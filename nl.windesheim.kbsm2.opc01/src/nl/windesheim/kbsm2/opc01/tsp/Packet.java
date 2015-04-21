/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.tsp;

import java.awt.Point;

/**
 *
 * @author Gebruiker
 */
public class Packet extends Point
{

    private boolean getPacket;
    private boolean packetAcquired;

    public Packet(int x, int y)
    {
        super(x, y);
        getPacket = false;
        packetAcquired = false;
    }

    public boolean getGetPacket()
    {
        return getPacket;
    }

    public void setGetPacket(boolean getPacket)
    {
        this.getPacket = getPacket;
    }

    public boolean getPacketAcquired()
    {
        return packetAcquired;
    }

    public void setPacketAcquired(boolean packetAcquired)
    {
        this.packetAcquired = packetAcquired;
    }

    public double getDistance(Point that)
    {
        return this.distance(that);
    }
}
