package collections;

import java.util.Comparator;

class AscendingConparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
public class Student implements Comparable<Student>{

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students -> [id: " + id + ", name: " + name + "]";
    }

     public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
     }

}
