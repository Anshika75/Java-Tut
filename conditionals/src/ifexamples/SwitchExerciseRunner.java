package ifexamples;

import java.util.Scanner;

public class SwitchExerciseRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = scanner.nextInt();
        System.out.println("Is Weekday: " + SwitchExercise.isWeekDay(day));
        System.out.print("Enter Month: ");
        int month = scanner.nextInt();
        System.out.println("Month: " + SwitchExercise.determineNameOfMonth(month));
        System.out.print("Enter Day: ");
        int dayOfWeek = scanner.nextInt();
        System.out.println("Day: " + SwitchExercise.determineNameOfDay(dayOfWeek));

    }
}
