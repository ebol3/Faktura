package kategoria;

public class KategoriaProsta extends Kategoria {

    private String nazwa;

    // dodaj array liste towaru
    public KategoriaProsta(String nazwa){
        this.nazwa = nazwa;
    }
//dodaj towar
    @Override
    public void wypiszNazwe() {
        System.out.println(this.nazwa);
    }
}
