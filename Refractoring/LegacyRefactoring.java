package Refractoring;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LegacyRefactoring {

    public void legacy() {
        Runnable runnable = createRunnable();
        runnable.run();

        Calculator calculator = createCalculator();

        Integer result = calculator.calculate(3);
        System.out.println("Calculation result: " + result);

        List<Integer> inputNumbers = Arrays.asList(1, null, 3, null, 5);
        List<Integer> resultNumbers = inputNumbers.stream()
                .filter(Objects::nonNull)
                .map(calculator::calculate)
                .collect(Collectors.toList());

        Consumer<Integer> method = createConsumer();
        System.out.println("Result numbers: ");
        resultNumbers.forEach(method);

        Formatter formatter = createFormatter();
        System.out.println("Formatted numbers: " + formatter.format(resultNumbers));
    }

    private Runnable createRunnable() {
        return () -> System.out.println("Runnable!");
    }

    private Formatter createFormatter() {
        return numbers -> numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private Consumer<Integer> createConsumer() {
        return System.out::println;
    }

    private Calculator createCalculator() {
        return number -> number * number;
    }

    public static void main(String[] args) {
        LegacyRefactoring lrf = new LegacyRefactoring();
        lrf.legacy();
    }

}