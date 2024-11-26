package functionalprogramming;

import java.util.List;

public class FpRunnerv2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printEvenNumbersInListFunctional(numbers);
        numbers.stream()
        .forEach(element -> System.out.println(element));
        int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
        System.out.println("Sum is " + sum);
        // numbers.stream().forEach(e -> System.out.println(e * e));
        numbers.stream().forEach(e -> System.out.println(e * e));

    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
        .filter(number -> number % 2 == 0)
        .forEach(element -> System.out.println(element));
    }

}
