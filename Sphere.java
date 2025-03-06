import java.util.Scanner;

// Sphere class extending Shape and implementing Volume
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }

    public double calculateArea() {
        return roundToTwoDecimal(4 * Math.PI * dim_one * dim_one);
    }

    public double calculatePerimeter() {
        return roundToTwoDecimal(2 * Math.PI * dim_one);
    }

    public double calculateVolume() {
        return roundToTwoDecimal((4.0 / 3) * Math.PI * dim_one * dim_one * dim_one);
    }

    public double calculateSurfaceArea() {
        return calculateArea();
    }

    public static Sphere getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        return new Sphere(sc.nextDouble());
    }
}
