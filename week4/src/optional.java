import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        String name = "Nitin Gupta";
        Optional<String> optionalName = getOptionalName(name);

        // Using Optional
        System.out.println(optionalName.orElse("Name not available"));

        name = null;
        optionalName = getOptionalName(name);
        System.out.println(optionalName.orElse("Name not available"));
    }

    public static Optional<String> getOptionalName(String name) {
        if (name != null) {
            return Optional.of(name);
        } else {
            return Optional.empty();
        }
    }
}
