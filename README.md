# Area and Volume Calculator of different Shapes

## Overview
This is a Java-based menu-driven program that calculates the area, perimeter, surface area, and volume of different geometric shapes. The program follows best coding practices, uses object-oriented programming principles, and is structured across multiple files for maintainability.

## Features
- Supports 2D and 3D shapes.
- Uses an abstract `Shape` class and a `Volume` interface.
- Provides a menu-driven system for user input.
- Rounds calculations to two decimal places.
- Implements different Java files for modularity.

## Shapes Included
- **2D Shapes (Inherit from `Shape`)**
  - Circle
  - Rectangle
  - Square

- **3D Shapes (Inherit from `Shape` and Implement `Volume`)**
  - Sphere
  - Cylinder
  - Equilateral Pyramid (Square Base)

## Class Structure
### `Shape.java`
- Abstract class defining the base properties of all shapes.
- Contains abstract methods for calculating area, perimeter, volume, and surface area.
- Implements a rounding method `roundToTwoDecimal()`.

### `Volume.java`
- Interface that declares the `calculateVolume()` method for 3D shapes.

### `Circle.java`
- Extends `Shape` and implements area and perimeter calculations.

### `Rectangle.java`
- Extends `Shape` and provides methods for calculating area and perimeter.

### `Square.java`
- Extends `Shape` and overrides necessary methods.

### `Sphere.java`
- Extends `Shape` and implements `Volume` for volume calculation.

### `Cylinder.java`
- Extends `Shape` and implements `Volume` for volume calculation.

### `EquilateralPyramid.java`
- Extends `Shape` and implements `Volume` for volume calculation.

### `Main.java`
- Provides a menu-driven interface for selecting a shape and performing calculations.
## Installation & Usage

### Prerequisites
- Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (Java 8 or later)
- Install any Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) or use the command line.

## Program Structure
```sh
Shape-Calculator/
│── Shape.java
│── Volume.java
│── Circle.java
│── Rectangle.java
│── Square.java
│── Sphere.java
│── Cylinder.java
│── EquilateralPyramid.java
│── Main.java
│── README.md
```

### Steps to Run the Program
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/Shape-Calculator.git
   ```
2. Navigate to the project directory:
   ```sh
   cd Shape-Calculator
   ```
3. Compile all Java files:
   ```sh
   javac Main.java
   ```
4. Run the program:
   ```sh
   Java Main
   ```
