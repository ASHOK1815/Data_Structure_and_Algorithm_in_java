package javaSamples;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    int rollNumber;
    int age;
    String name;

    public Student(int rollNumber, int age, String name) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student obj) {

        if(name.length() == obj.name.length()) return 0;
        else if(name.length() > obj.name.length())  return 1;
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparbleClass<S> {
    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(6735,22,"ASHOK KUMAWAT"));
        arrayList.add(new Student(6705,23,"JAVED ALI"));
        arrayList.add(new Student(2467,23,"SUNIL VASHIST"));
        arrayList.add(new Student(6714,24,"KUMAR VAIBHAW"));

        Collections.sort(arrayList);
        System.out.println(arrayList);



    }
}
