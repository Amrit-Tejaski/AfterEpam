package in.conditionals.loops;

public class MensurationMaster {

    // ==========================================
    // 📐 2D SHAPES - AREA (क्षेत्रफल)
    // ==========================================

    // 1. Area of Circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area of Triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // 3. Area of Rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // 4. Area of Isosceles Triangle
    public static double areaOfIsoscelesTriangle(double equalSide, double base) {
        return 0.25 * base * Math.sqrt((4 * equalSide * equalSide) - (base * base));
    }

    // 5. Area of Parallelogram
    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    // 6. Area of Rhombus
    public static double areaOfRhombus(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    // 7. Area of Equilateral Triangle
    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // ==========================================
    // 🔁 2D SHAPES - PERIMETER (परिमाप)
    // ==========================================

    // 8. Perimeter of Circle (Circumference)
    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    // 9. Perimeter of Equilateral Triangle
    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    // 10. Perimeter of Parallelogram
    public static double perimeterOfParallelogram(double base, double side) {
        return 2 * (base + side);
    }

    // 11. Perimeter of Rectangle
    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    // 12. Perimeter of Square
    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }

    // 13. Perimeter of Rhombus
    public static double perimeterOfRhombus(double side) {
        return 4 * side;
    }

    // ==========================================
    // 📦 3D SHAPES - VOLUME (आयतन)
    // ==========================================

    // 14. Volume of Cone
    public static double volumeOfCone(double radius, double height) {
        // (1.0 / 3.0) इस्तेमाल किया ताकि Integer Division की वजह से 0 न आए
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    // 15. Volume of Prism
    public static double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    // 16. Volume of Cylinder
    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 17. Volume of Sphere
    public static double volumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // 18. Volume of Pyramid
    public static double volumeOfPyramid(double baseArea, double height) {
        return (1.0 / 3.0) * baseArea * height;
    }

    // ==========================================
    // 🏷️ 3D SHAPES - SURFACE AREA (पृष्ठ क्षेत्रफल)
    // ==========================================

    // 19. Curved Surface Area (CSA) of Cylinder
    public static double csaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    // 20. Total Surface Area (TSA) of Cube
    public static double tsaOfCube(double side) {
        return 6 * side * side;
    }

    // ==========================================
    // 🧪 TESTING ALL METHODS IN MAIN
    // ==========================================
    public static void main(String[] args) {
        System.out.println("--- 📐 Mensuration Master Cheat Sheet Testing 📐 --- \n");

        // 2D Testing
        System.out.printf("1. Area of Circle (r=5): %.2f\n", areaOfCircle(5));
        System.out.printf("4. Area of Isosceles Triangle (s=10, b=5): %.2f\n", areaOfIsoscelesTriangle(10, 5));
        System.out.printf("7. Area of Equilateral Triangle (s=5): %.2f\n", areaOfEquilateralTriangle(5));
        System.out.printf("8. Perimeter of Circle (r=5): %.2f\n", perimeterOfCircle(5));

        // 3D Testing
        System.out.printf("14. Volume of Cone (r=3, h=7): %.2f\n", volumeOfCone(3, 7));
        System.out.printf("17. Volume of Sphere (r=3): %.2f\n", volumeOfSphere(3));
        System.out.printf("19. CSA of Cylinder (r=4, h=10): %.2f\n", csaOfCylinder(4, 10));
        System.out.printf("20. TSA of Cube (s=4): %.2f\n", tsaOfCube(4));
    }
}

