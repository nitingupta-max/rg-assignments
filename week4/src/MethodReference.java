import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Hello", "World", "Welcome", "How");

        // Using a lambda expression
        names.forEach((name) -> System.out.println(name));

        // Using a method reference
        names.forEach(System.out::println);

        // Using a method reference with a functional interface
        Consumer<String> print = System.out::println;
        print.accept("Hello, World!");
    }
}