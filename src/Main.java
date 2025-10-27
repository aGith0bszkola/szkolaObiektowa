public class Main {
    public static void main(String[] args) {

        osoba osoba1 = new uczen();
        System.out.println(osoba1.imie);
        osoba1.imie = "jaś";
        System.out.println(osoba1.imie);
        osoba1.setWiek(10);
        System.out.println("wiek "+osoba1.getWiek());
        System.out.println("imie "+osoba1.imie);
        System.out.println("liczba uczniow "+uczen.getLiczbaUczniow());
        uczen uczen1 = new uczen("jadwiga",16,123);
        uczen uczen2 = new uczen("tadzio",17,1234);
        System.out.println("liczba uczniow "+uczen.getLiczbaUczniow());
        System.out.println(uczen1);
        System.out.println(uczen2);
        Nauczyciel nauczycielMatematyki = new Nauczyciel("magiera",72,"matematyka");
        System.out.println(nauczycielMatematyki);
        nauczycielMatematyki.wykonajDyzur();
        uczen2.wykonajDyzur();//polimorfizm
    }
}