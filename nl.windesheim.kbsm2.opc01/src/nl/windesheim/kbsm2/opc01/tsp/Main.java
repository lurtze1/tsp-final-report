package nl.windesheim.kbsm2.opc01.tsp;

import javax.swing.JFrame;

public class Main
{

    public static void main(String[] args)
    {
        Packet a = new Packet(10, 20);
        Packet b = new Packet(5, 30);
        System.out.println(a.distance(b));
    }
}
