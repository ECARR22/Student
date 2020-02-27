package ie.gmit;

import java.util.ArrayList;

public class StudentList {

    public void addStudent(){
        Student s1 = new Student("Evan", "evan@gmail.com");
        Student s2 = new Student("Bob", "Bob@gmail.com");

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);

    }




}
