package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student {
    int rollno;
    String Name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        Name = name;
        this.age = age;
    }

}
class Driver{
    public static void main(String[] args) {
        // array list of user defined objects
        ArrayList<Student> s = new ArrayList<Student>();

        Student s1= new Student(101,"Yeswanth",19);
        Student s2= new Student(102,"Shivani",18);
        Student s3= new Student(103,"Amulya",20);
        Student s4= new Student(104,"Chaitanya",20);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        Iterator  itr = s.iterator();
        while (itr.hasNext()){
            Student student= (Student) itr.next(); // iterator to student => typeCasting
            System.out.println(student.Name+"  "+student.age+"  "+student.rollno);
        }

    }
}