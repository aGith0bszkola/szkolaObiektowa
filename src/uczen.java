public class uczen extends osoba implements Dyzurny{
    //uczen jest klasą potomną klasy bvazopaqwej osoba
    //dziedziczenie
    private int  nrUcznia;
    private  static int LiczbaUczniow;
    //static pole klasu a nie obiektu


    public uczen() {
        LiczbaUczniow++;
        nrUcznia = LiczbaUczniow;
    }

    public uczen(String imie, int wiek, int nrUcznia) {
        super(imie, wiek);
        this.nrUcznia = nrUcznia;
        LiczbaUczniow++;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    public static int getLiczbaUczniow() {
        return LiczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        LiczbaUczniow = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "uczen " +
                "nrUcznia=" + nrUcznia +
                ", imie " + imie +
                " ,wiek" + getWiek();

    }

    @Override
    public void wykonajDyzur() {
        System.out.println("umycie tablicy");
    }
}
