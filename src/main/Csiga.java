
package main;

import java.util.Random;


public class Csiga {
    
    public static final String RESET = "\u001B[0m";
    public static final String PIROS = "\u001B[31m";
    public static final String KEK = "\u001B[34m";
    public static final String ZOLD = "\u001B[32m";
    
    public enum Szinek {PIROS, KEK, ZOLD};
    private Szinek szin;
    
    private int tav = 0;
    private Random rnd = new Random();
    
    public Csiga (Szinek szin){
        this.szin = szin;
    }
    
    public void megy(boolean gyorsito){
        int lepes = rnd.nextInt(4);
        
        if(gyorsito){
            lepes *= 2;
            System.out.println(szin + "csiga gyorsítót kapott");
        }
        tav += lepes;
    }

    public Szinek getSzin() {
        return szin;
    }

    public int getTav() {
        return tav;
    }
    
    
    
}
