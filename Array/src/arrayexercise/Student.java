package arrayexercise;

public class Student {
    private String name;
    private int[] marks;
    
    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for (int mark : marks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    public double getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return (double) sum / number;
    }

    public void addNewMark(int mark) {
        int[] newMarks = new int[marks.length + 1];
        for (int i = 0; i < marks.length; i++) {
            newMarks[i] = marks[i];
        }
        newMarks[marks.length] = mark;
        marks = newMarks;
    }

    // Make removeMarkAtIndex public to ensure accessibility
    public void removeMarkAtIndex(int index) {
        if (index < 0 || index >= marks.length) {
            return;
        }
        int[] newMarks = new int[marks.length - 1];
        for (int i = 0, j = 0; i < marks.length; i++) {
            if (i == index) {
                continue;
            }
            newMarks[j++] = marks[i];
        }
        marks = newMarks;
    }
}
