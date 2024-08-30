package exercises.ex1;

public class Person {

    private final String vorname ;
    private final String nachname;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname(){
        return this.vorname;
    }
    public String getNachname(){
        return this.nachname;
    }

    @Override
    public String toString(){
        return "Vorname : " + this.vorname + "\n" +
                "Nachname : " + this.nachname + "\n" ;
    }

}
