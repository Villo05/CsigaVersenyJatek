
package main;

import java.util.Random;
import main.Csiga.Szinek;


public class CsigaVerseny {
    private Csiga cs1 = new Csiga(Szinek.PIROS);
    private Csiga cs2 = new Csiga(Szinek.KEK);
    private Csiga cs3 = new Csiga(Szinek.ZOLD);
    
    private Random rnd = new Random();
    private Jatekos jatekos = new Jatekos();
    
    private void start(){
        
    }
    
    public void teszt(){ //a kész kódba nem lesz benne
        System.out.println("Piros csiga" + cs1);
        System.out.println("Kék csiga" + cs2);
        System.out.println("Zöld csiga" + cs3);

    }
}
