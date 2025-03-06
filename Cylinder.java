//Cylinder.java

import java.util.Scanner;

// Cylinder class extending Shape and implementing Volume
class Cylinder extends Shape implements Volume {
    public Cylinder(double radius, double height) {
        super(radius, height, 0, 0);
    }

    public double calculateArea() {
        return roundToTwoDecimal(2 * Math.PI * dim_one * (dim_one + dim_two));
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(2 * Math.PI * dim_one);
    }

    public double calculateVolume() {
        return roundToTwoDecimal(Math.PI * dim_one * dim_one * dim_two);
    }

    public double calculateSurfaceArea() {
        return calculateArea();
    }

    public static Cylinder getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        double height = sc.nextDouble();
        return new Cylinder(radius, height);
    }
}
