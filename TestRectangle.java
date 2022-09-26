//21353123 Nicholas O'Mahony

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle noArgRectangle = new Rectangle();
        Rectangle rectangle = new Rectangle(4, 5.5);

        System.out.println("No Arg");
        System.out.println("width: " + noArgRectangle.getWidth());
        System.out.println("height: " + noArgRectangle.getHeight());
        System.out.println("Area: " + noArgRectangle.getArea());
        System.out.println("Perimeter: " + noArgRectangle.getPerimeter());
        System.out.println();
        System.out.println("With arguments");
        System.out.println("width: " + rectangle.getWidth());
        System.out.println("height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
