package functionalprogramming;

import java.util.List;

public class FpRunnerv2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printFunctional(list);
    }
    private static void printFunctional(List<Integer> list) {
        list.stream().forEach(element -> System.out.println("element - " + element));

        list.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println("element - " + element));
    }
}
