/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.bpp;

import java.util.*;

/**
 *
 * @author W7Home
 */
public class Algoritme {

    private String naam;
    private boolean firstFit;
    private boolean bestFit;
    private boolean nextFit;

    private int doosGrootte;
    private ArrayList<Integer> paketten;
    private int overschot;
    private int aantalDozen;
    private ArrayList<ArrayList<Integer>> dozen;

    public Algoritme(String naam, boolean bestFit, boolean firstFit, boolean nextFit) {
        this.naam = naam;
        this.bestFit = bestFit;
        this.firstFit = firstFit;
        this.nextFit = nextFit;
    }

    public void algoritmeFirstFit() {
        int sum;
        paketten:
        for (Integer check : paketten) {
            for (int doos = 0; doos < dozen.size(); doos++) {
                sum = dozen.get(doos).stream().mapToInt(Integer::intValue).sum();
                if ((sum + check) <= doosGrootte) {
                    dozen.get(doos).add(check);
                    continue paketten;
                }
            }
            aantalDozen++;
            ArrayList<Integer> nieuwedoos = new ArrayList<Integer>();
            nieuwedoos.add(check);
            dozen.add(nieuwedoos);
        }
    }

    public void algoritmeBestFit() {

    }

    public void algoritmeNextFit() {

    }

    public boolean isFirstFit() {
        return firstFit;
    }

    public boolean isBestFit() {
        return bestFit;
    }

    public boolean isNextFit() {
        return nextFit;
    }

}
