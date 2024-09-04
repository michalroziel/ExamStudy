package generics.exam;
import java.util.*;
public class Translation implements Comparable<Translation>{

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    private String translation;

    public Translation(String word){
        this.translation = word;
    }


    @Override
    public int compareTo(Translation o) {
        return this.getTranslation().compareTo(o.getTranslation());
    }
}
