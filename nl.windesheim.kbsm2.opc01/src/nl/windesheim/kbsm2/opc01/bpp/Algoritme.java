/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.windesheim.kbsm2.opc01.bpp;

/**
 *
 * @author W7Home
 */
public class Algoritme {
    private String naam;
    private boolean firstFit;
    private boolean bestFit;
    private boolean nextFit;
    
    public Algoritme(String naam, boolean bestFit, boolean firstFit, boolean nextFit){
        this.naam = naam;
        this.bestFit = bestFit;
        this.firstFit = firstFit;
        this.nextFit = nextFit;
    }
    
    public void algoritmeFirstFit(){
        
    }
    public void algoritmeBestFit(){
        
    }
    public void algoritmeNextFit(){
        
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
