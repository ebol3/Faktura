package kategoria;

import java.util.ArrayList;

public class KategoriaZlozona extends Kategoria{

    private ArrayList<Kategoria> kolekcjaKategorii = new ArrayList<>();
    public String nazwa;
//    public String name;
    public KategoriaZlozona(String nazwa){
        this.nazwa = nazwa;
    }
    public void dodajKategorie(Kategoria k){
        kolekcjaKategorii.add(k);
    }
    @Override
    public void wypiszNazwe() {
        System.out.println(this.nazwa + "-----------------");
        for (Kategoria kategoria : kolekcjaKategorii){
            kategoria.wypiszNazwe();
        }
    }
}
