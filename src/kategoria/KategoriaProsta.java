package kategoria;

import magazyn.Towar;

import java.util.ArrayList;

public class KategoriaProsta extends Kategoria {

    private String nazwa;

    // dodaj array liste towaru
    private ArrayList<Towar> KolekcjaT= new ArrayList<>();
    public KategoriaProsta(String nazwa){
        this.nazwa = nazwa;
    }
//dodaj towar
    public void dodatTowar(Towar towar){
        this.KolekcjaT.add(towar);
    }
    @Override
    public void wypiszNazwe() {
        System.out.println(" " + this.nazwa);
        if (!KolekcjaT.isEmpty()){
            for (Towar towar : KolekcjaT){
                System.out.println(" " + towar);
            }
        }
    }
}
