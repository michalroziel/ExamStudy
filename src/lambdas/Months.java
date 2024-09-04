package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Months {
    private java.util.Arrays Arrays;
    List<String> listOfMonths = Arrays.asList("Januar", "Februar", "März","April","Mai","Juni","Juli",
            "August","September","Oktober","November","Dezember");

    //A
    public List<String> monthsBigLetter(){

        List<String> newList = listOfMonths.stream().filter(s->s.length()>=4).map(String::toUpperCase)
                .toList();

       return  newList;
    }

    //B
    public void amountOfLettersOfFilteredMonths(){


        listOfMonths.stream().filter(s->s.length() >=4).forEach(s -> {

            int sum = 0;
            sum+=s.length();
        });


    }

    //C
    public List<String> filteredMonths(){

       return listOfMonths.stream().filter(s-> s.length()>=4).collect(Collectors.toList());
    }

    //D

    public Map<Integer,String> filteredMonthsWrittenInMap(){

        Map<Integer,String> newMap = listOfMonths.stream()
                .filter(v -> v.length()>= 4).collect(Collectors
                        .toMap(String::length,v -> v));
        return newMap;

    }

    public static void main(String[] args) {
        Months m = new Months();



    }


}
