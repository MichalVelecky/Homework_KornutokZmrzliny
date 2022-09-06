package uloha5_kornutokZmrzliny;

import java.util.Scanner;

public class KornutokZmrzlinyTester {
    public static void main(String[] args) {
        KornutokZmrzliny kornutok = new KornutokZmrzliny();
        Scanner vstup = new Scanner(System.in);

        int polomer;
        int vyska;


        System.out.print("Zadaj polomer: ");
        polomer = vstup.nextInt();
        System.out.print("Zadaj vysku: ");
        vyska = vstup.nextInt();

        kornutok.ObjemKurnutka(polomer, vyska);
        kornutok.PovrchKornutka(polomer, vyska);

        System.out.printf("Objem kornutka je: %.2f " , kornutok.getObjem());
        System.out.printf("\nPovrch plasta je: %.2f " , kornutok.getPovrch());

    }
}
