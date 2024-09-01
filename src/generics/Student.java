package generics;

public class Student {

    private String name;
    private int age;
    private float grade;

    public Student(String givenName, int givenAge, float givenGrade ){
        this.name = givenName;
        this.age = givenAge;
        this.grade = givenGrade;

    }




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

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
