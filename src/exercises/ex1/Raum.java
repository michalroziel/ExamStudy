package exercises.ex1;

import java.util.LinkedList;

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
        return this.geb + "-" + this.etage + "." + this.raum;
    }


}
