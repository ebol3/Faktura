package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class Drukuj1 extends Drukuj{
    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("#####################################################");
        System.out.println("Firma: " + faktura.getKontrahent() + "  " + faktura.getDataSprzedazy() );
    }
    @Override
    public void drukujPozycje(Faktura faktura) {
        System.out.println("#####################################################");
        int numerPozycji = 0;
        Iterator<Pozycja> iteratorPozycji= faktura.getIteratorPozycji();
        while (iteratorPozycji.hasNext()) {
            numerPozycji++;
            Pozycja pozycja = iteratorPozycji.next();
            System.out.println("Pozycja " + numerPozycji + ": " + pozycja.getNazwa() + ", ilość: " + pozycja.getIlosc() + ", wartość: " + pozycja.getWartosc());
        }
    }
    @Override
    public void drukujStopke(Faktura faktura) {
        System.out.println("#####################################################");
        System.out.println("Suma: " + faktura.getSuma() + "\n");
    }

}
