import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Find the sum of squares of even numbers greater than 5
        int sumOfSquares = numbers.stream()
                .filter(n -> n > 5 && n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Sum of squares of even numbers greater than 5: " + sumOfSquares);

        // Convert a list of strings to uppercase
        List<String> names = Arrays.asList("Nitin", "Gupta", "Tanav", "Narun");
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase names: " + uppercaseNames);
    }
}