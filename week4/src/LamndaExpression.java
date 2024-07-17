// Functional Interface
interface Drawable {
    void draw(int radius);
}

public class LamndaExpression {
    public static void main(String[] args) {
        // Using an Anonymous Inner Class
        Drawable d1 = new Drawable() {
            @Override
            public void draw(int radius) {
                System.out.println("radius of circle : " + radius);
            }
        };
        d1.draw(10);

        // Using a Lambda Expression
        Drawable d2 = (int radius) -> {
            System.out.println("radius of circle : " + radius);
        };
        d2.draw(10);
    }
}