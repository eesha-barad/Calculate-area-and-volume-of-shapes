//Circle.java

import java.util.Scanner;

// Circle class extending Shape
class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0, 1);
    }

    public double calculateArea() {
        return roundToTwoDecimal(Math.PI * dim_one * dim_one);
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(2 * Math.PI * dim_one);
    }

    public double calculateVolume() {
        return 0;
    }

    public double calculateSurfaceArea() {
        return 0;
    }

    public static Circle getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        return new Circle(sc.nextDouble());
    }
}
