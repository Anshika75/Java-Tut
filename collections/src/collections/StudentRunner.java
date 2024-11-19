package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"));
        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);
        Collections.sort(studentsAl, new AscendingConparator());
        System.out.println("RAscendingConparator" + studentsAl);
    }

}
