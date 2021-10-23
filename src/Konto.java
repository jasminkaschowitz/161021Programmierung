public class Konto {
    private String kontoinhaber;
    private double kontostand;
    private int idNumber;
    public static int s_anzahlKonto = 10;

    public Konto(String inhaber) {
        this.kontoinhaber = inhaber;
        kontostand = 0;
        this.idNumber = s_anzahlKonto++;
    }

    public void setInhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
        kontostand = 0;
    }

    public void aufbuchen (double betrag) {
        if (betrag > 0) {
            kontostand = kontostand + betrag;
        }
        else {
            System.out.println("Nur Werte > 0 sind erlaubt");
        }
    }

    public void abbuchen (double betrag) {
        if (kontostand >= betrag) {
            kontostand -= betrag;
        }
    else{
            System.out.println("Nicht genügend Geld am Konto!");
        }
    }

    public void print () {
        System.out.println(idNumber + ": " + "Kontoinhaber: " + kontoinhaber + "; Kontostand: " + kontostand);
    }



}

