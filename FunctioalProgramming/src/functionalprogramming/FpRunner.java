package functionalprogramming;

import java.util.List;

public class FpRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printFunctional(list);
    }

    private static void printBasic(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    private static void printFunctional(List<String> list) {
        list.stream()
        .filter(element -> element.endsWith("at"))
        .forEach(element -> System.out.println("element - " + element));
    }
}
