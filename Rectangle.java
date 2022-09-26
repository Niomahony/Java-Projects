//21353123 Nicholas O'Mahony

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }
}