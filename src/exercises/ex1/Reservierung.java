package exercises.ex1;

public class Reservierung {

    private String bemerkung;
    Uhrzeit beginn ;
    Uhrzeit ende;
    Mitarbeiter mitarbeiter ;
    Raum raum ;

    public Reservierung(Uhrzeit beginn, Uhrzeit ende){
        this.beginn = beginn;
        this.ende = ende;
    }

    public void setBemerkung(String bemerkung){
        this.bemerkung = bemerkung;
    }

    public void setRaum(Raum raum){
        this.raum = raum;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter){
        this.mitarbeiter = mitarbeiter;
    }

}
