package generics;

import java.util.Comparator;

public class ComparatorTestDrive {

    public static void main(String[] args) {

        Comparator<Student> studentAgeComparator = Comparator.comparingInt((s -> s.getAge()));
        Comparator<Student> studentGradeComparator = Comparator.comparingDouble(s-> s.getGrade());
        Comparator<Student> reversedAgeOrderComparatpr = studentAgeComparator.reversed();

            Student s1 = new Student("John", 20, 3.5f);
            Student s2 = new Student("Bob", 21, 3.6f);
            Student s3 = new Student("Alice", 23, 3.5f);



        };
    }


