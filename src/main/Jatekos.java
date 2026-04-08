
package main;

import java.util.Scanner;

public class Jatekos {

    private int tipp;

    public void tippel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Melyik csigára fogadsz?");
        System.out.println("1 - Piros");
        System.out.println("2 - Zöld");
        System.out.println("3 - Kék");

        tipp = sc.nextInt();
    }

    public int getTipp() {
        return tipp;
    }
}

