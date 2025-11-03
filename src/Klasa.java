import java.util.ArrayList;

public class Klasa {
    private Wychowawca wychowawca;
    private ArrayList<uczen> uczniowe;
    private String nazwaKlasy;
    //co ta klasa powinna "wiedzieć"

    public Klasa(Wychowawca wychowawca, ArrayList<uczen> uczniowe, String nazwaKlasy) {
        this.wychowawca = wychowawca;
        this.uczniowe = uczniowe;
        this.nazwaKlasy = nazwaKlasy;
    }

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowe = new ArrayList<>();
    }
}
