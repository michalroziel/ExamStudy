package collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class PersonTreeMapTestDrive {

    // a tree map is a map, so we are mapping keys to values.
    // a tree map, unlike a hashmap is also sorted according to its keys.

    public static void main(String[] args) {
    TreeMap<String,Integer> treeMap = new TreeMap<>();
    Person p1 = new Person("Alice",23);
    Person p2 = new Person("Bob",42);
    Person p3 = new Person("Charlie",65);


    treeMap.put(p3.getName(),p3.getAge());
    treeMap.put(p2.getName(),p2.getAge());
    treeMap.put(p1.getName(), p1.getAge());

        // even though Alice is added as the last person, it is printed as first entry
        // sorted after Key -> Lexicographically after Name
        System.out.println(treeMap);

    }


}
