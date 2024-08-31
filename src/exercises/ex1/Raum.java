package exercises.ex1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Raum {
    private int geb;
    private int etage;
    private int raum;

    private LinkedList<Reservierung>  buchungen= new LinkedList<Reservierung>();

    public Raum(int geb, int etage, int raum){
        this.geb = geb;
        this.etage = etage;
        this.raum = raum;
    }

    public void addReservierung(Reservierung reservierung){
        this.buchungen.add(reservierung);
        reservierung.setRaum(this);
    }

    @Override
    public String toString(){

        StringBuilder sb  = new StringBuilder();
        sb.append(this.geb).append("-").append(this.etage).append(".").append(this.raum);

        Iterator<Reservierung> myiter = buchungen.iterator();


        while(myiter.hasNext()){
        Reservierung reserv = myiter.next();

            sb.append("\ngebucht von \n")
                    .append(reserv.mitarbeiter.getVorname()).append(" ")
                    .append(reserv.mitarbeiter.getNachname()).append(" ")
                    .append(reserv.mitarbeiter.getEmail()).append(" ")
                    .append("von ").append(reserv.beginn)
                    .append("bis ").append(reserv.ende)
                    .append(" für ")
                    .append(reserv.getBemerkung());

        }
        return sb.toString();

    }


}
