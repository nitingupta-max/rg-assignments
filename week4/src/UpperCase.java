import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nitin", "Gupta", "Akash", "Solanki");

        // Convert the list to uppercase using map
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the original and uppercase lists
        System.out.println("Original names: " + names);
        System.out.println("Uppercase names: " + uppercaseNames);
    }
}