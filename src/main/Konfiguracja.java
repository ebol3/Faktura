package main;

import rabaty.*;

public class Konfiguracja {
    private static Konfiguracja instance;

    private Konfiguracja(){}




    public static Konfiguracja getInstance(){
        if (instance == null) instance =new Konfiguracja();

        return instance;
    }

    public double getKwotaRabatu(){
        return 1;
    }

    public double getProcentRabatu(){
        return 25;
    }
    public IObliczCenePoRabacie getBiezacyRabat(){
//        return new ObliczCenePoRabacieProcentowym();
//        return new ObliczCenePoRabacieKwotowym();
//        return new AdapterRabatuLosowegoObiektowy();
        return new AdapterRabatuLosowegoKlasowy();
    }
}