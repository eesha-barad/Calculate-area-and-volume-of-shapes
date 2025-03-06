//Square.java 

import java.util.Scanner;

// Square class extending Shape
class Square extends Shape {
    public Square(double side) {
        super(side, 0, 0, 4);
    }

    public double calculateArea() {
        return roundToTwoDecimal(dim_one * dim_one);
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(4 * dim_one);
    }

    public double calculateVolume() {
        return 0;
    }

    public double calculateSurfaceArea() {
        return 0;
    }

    public static Square getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        return new Square(sc.nextDouble());
    }
}
