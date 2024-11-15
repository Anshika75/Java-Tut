package oops;

public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 34);
        System.out.println(rectangle);
        System.out.printf("Area of recatngle is: %f", rectangle.calculateArea()).println();
        System.out.printf("Perimeter of rectangle is: %f", rectangle.calculatePerimeter()).println();;
    }

}
