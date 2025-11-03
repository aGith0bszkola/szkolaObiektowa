public abstract class osoba {
    //z klasy abstrakcyjnej nie można utworzyć obiektu tej klasy
    public String imie; // dostępne wszędie
    private int wiek; // hermetyzacja zamknęte dostępene tylko w klasei
    //protected w tej klasie i klasach potomnych (tylko w Javir w ramach pakietu)
    //brak modyfikatowa dostępnu  - dostęp w pakiecie
    //konstruktor
    public osoba() {
        imie = "";
        wiek = 0;
    }

    public osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<00 || wiek>110){
            this.wiek = 0;
        }else {
            this.wiek = wiek;
        }
    }

    @Override
    public String toString() {
        return "osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
