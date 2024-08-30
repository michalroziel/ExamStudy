package exercises.ex1;

public class Uhrzeit {
    private final int stunde ;
    private final int minute ;

    public Uhrzeit(int stunde, int minute ){
        this.stunde = stunde;
        this.minute = minute;
    }

    @Override
    public String toString(){

        return stunde+":"+minute +":" + "Uhr" + "\n";
    }

}
