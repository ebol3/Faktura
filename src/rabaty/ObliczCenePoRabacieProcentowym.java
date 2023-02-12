package rabaty;

import main.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements IObliczCenePoRabacie {

    @Override
    public double obliczCenePoRabacie(double cena) {

        Konfiguracja k = Konfiguracja.getInstance();

        double procentRabatu = k.getProcentRabatu();
        return cena -=procentRabatu/100 * cena;
    }
}
