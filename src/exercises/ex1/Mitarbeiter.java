package exercises.ex1;

public class Mitarbeiter extends Person{


    private String email;

    public Mitarbeiter(String vorname, String nachname, String email ){
        super(vorname, nachname);

        this.email = email;
    }

    public void reserviere(Raum raum, Uhrzeit beginn, Uhrzeit ende, String bemerkung){

        Reservierung reservierung = new Reservierung( beginn,ende);
        reservierung.setBemerkung(bemerkung);
        reservierung.setRaum(raum);
        raum.addReservierung(reservierung);

    }

    @Override
    public String toString(){
        return super.getVorname() + " " +
                super.getNachname() + " " +
                "("+this.email + ")";

    }



}
