
package main;

import java.util.Random;
import main.Csiga.Szinek;


public class CsigaVerseny {
    private Csiga cs1 = new Csiga(Szinek.PIROS);
    private Csiga cs2 = new Csiga(Szinek.KEK);
    private Csiga cs3 = new Csiga(Szinek.ZOLD);
    
    private Random rnd = new Random();
    private Jatekos jatekos = new Jatekos();
    
    public void start(){
        jatekos.tippel();
        
        for (int kor = 1; kor <= 5; kor++) {
            System.out.println("\n " + kor + ". kör");

            int gyorsitoIndex = -1;

            if (rnd.nextInt(100) < 20) {
                gyorsitoIndex = rnd.nextInt(3);
            }

            cs1.megy(gyorsitoIndex == 0);
            cs2.megy(gyorsitoIndex == 1);
            cs3.megy(gyorsitoIndex == 2);

            allas();
        }

        eredmeny();
    }

    private void allas() {
        cs1.rajzol();
        cs2.rajzol();
        cs3.rajzol();
    }

    private void eredmeny() {
        int max = Math.max(cs1.getTav(), Math.max(cs2.getTav(), cs3.getTav()));
        int nyertes = 0;

        if (cs1.getTav() == max) nyertes = 1;
        else if (cs2.getTav() == max) nyertes = 2;
        else nyertes = 3;

        System.out.println("\nNyertes csiga: " + nyertes);

        if (jatekos.getTipp() == nyertes) {
            System.out.println("Nyertél!");
        } else {
            System.out.println("Vesztettél!");
        }
    }
}
    
    
    

