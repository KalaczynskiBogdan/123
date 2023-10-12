package classwork4;

public class Main {
    public static void main(String[] args) {
        Shape triangle = () -> {
            System.out.println("We are drawing triangle");

        };
        Shape rectangle = () -> {
            System.out.println("We are drawing rectangle");

        };
        Shape circle = () -> {
            System.out.println("We are drawing circle");
        };
        triangle.draw();
        rectangle.draw();
        circle.draw();

    }
}
