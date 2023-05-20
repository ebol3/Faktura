package druk;

import dokumenty.Faktura;

public abstract class Drukuj {
    public final void wypiszFakture(Faktura faktura) {
        drukujNaglowek(faktura);
        drukujPozycje(faktura);
        drukujStopke(faktura);
    }
    public abstract void drukujNaglowek(Faktura faktura);

    public abstract void drukujPozycje(Faktura faktura);

    public abstract void drukujStopke(Faktura faktura);

}