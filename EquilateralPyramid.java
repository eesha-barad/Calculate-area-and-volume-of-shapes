//EquilateralPyramid.java

import java.util.Scanner;

// Equilateral Pyramid class extending Shape and implementing Volume
class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double baseSide, double height) {
        super(baseSide, height, 0, 4);
    }

    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
        double lateralArea = 2 * dim_one * slantHeight;
        return roundToTwoDecimal(baseArea + lateralArea);
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(4 * dim_one);
    }

    public double calculateVolume() {
        return roundToTwoDecimal((1.0 / 3) * dim_one * dim_one * dim_two);
    }

    public double calculateSurfaceArea() {
        return calculateArea();
    }

    public static EquilateralPyramid getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base side of Equilateral Pyramid: ");
        double baseSide = sc.nextDouble();
        System.out.print("Enter height of Equilateral Pyramid: ");
        double height = sc.nextDouble();
        return new EquilateralPyramid(baseSide, height);
    }
}
