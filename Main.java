import java.util.Scanner;

// Name: [Your Name]
// PRN: [Your PRN]
// Batch: [Your Batch]

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSelect a Shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1: shape = Circle.getInput(); break;
                case 2: shape = Rectangle.getInput(); break;
                case 3: shape = Square.getInput(); break;
                case 4: volumeShape = Sphere.getInput(); break;
                case 5: volumeShape = Cylinder.getInput(); break;
                case 6: volumeShape = EquilateralPyramid.getInput(); break;
                case 7: System.exit(0);
                default: System.out.println("Invalid choice! Try again.");
            }

            if (shape != null) {
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

            if (volumeShape != null) {
                System.out.println("Volume: " + volumeShape.calculateVolume());
                System.out.println("Surface Area: " + ((Shape) volumeShape).calculateSurfaceArea());
            }
        }
    }
}
