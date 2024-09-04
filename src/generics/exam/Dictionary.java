package generics.exam;

import collections.Car;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Dictionary <K,V> {

    // Declare your data structure here
    private TreeMap<K,V> dictionary;

    // a) Constructor: Initialize the data structure
    public Dictionary() {
        this.dictionary = new TreeMap<>();
    }

    public void  insert(K entries,V translation){
        dictionary.put(entries,translation);
    }

    public boolean inserAll(List< ? extends K> entries, List< ? extends V> values){

        int size = entries.size();

        for ( int i = 0 ; i < entries.size(); i++){
            dictionary.put(entries.get(i),values.get(i));
        }

        return true;
    }

    public V getTranslation(K word){

        if (word != null){
          return dictionary.get(word);
        }
        else return null;
    }

    // passiven iterator
    public void printAll() {

        dictionary.forEach((k, v) -> System.out.println(k + " : " + v));

    }

    public void removeIf(Predicate<K> p){

        dictionary.keySet().removeIf(p);
    }






}