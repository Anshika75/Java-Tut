package arrayexercise;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student("Ranga", 50, 60, 70, 23, 90);
        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark: " + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark: " + minimumMark);
        System.out.println("Average mark: " + student.getAverageMarks());
        student.addNewMark(100);
        System.out.println("New number of marks: " + student.getNumberOfMarks());
        System.out.println("New sum of marks: " + student.getTotalSumOfMarks());
        System.out.println("New average mark: " + student.getAverageMarks());
        student.removeMarkAtIndex(1);
        System.out.println("New number of marks: " + student.getNumberOfMarks());
        System.out.println("New sum of marks: " + student.getTotalSumOfMarks());
        System.out.println("New average mark: " + student.getAverageMarks());
    }

}
