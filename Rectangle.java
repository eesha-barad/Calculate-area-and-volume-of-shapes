//Rectangle.java

import java.util.Scanner;

// Rectangle class extending Shape
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0, 4);
    }

    public double calculateArea() {
        return roundToTwoDecimal(dim_one * dim_two);
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(2 * (dim_one + dim_two));
    }

    public double calculateVolume() {
        return 0;
    }

    public double calculateSurfaceArea() {
        return 0;
    }

    public static Rectangle getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        return new Rectangle(length, width);
    }
}
