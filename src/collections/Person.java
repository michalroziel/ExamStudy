package collections;

public class Person implements Comparable<Person>{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name ;
    private int age;

    public Person(String givenName, int givenAge){
        this.name = givenName;
        this.age = givenAge;
    }



    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
