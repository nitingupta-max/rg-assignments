//question 4

public class Singleton {
    // The single instance of the class
    private static Singleton instance;


    // Private constructor (prevent direct instantiation of the class from outside)
    private Singleton() {}


    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
