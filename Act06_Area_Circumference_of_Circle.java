public class Act06_Area_Circumference_of_Circle {
    public static void main(String[] args) {
        double radius = 14;
        double pi = Math.PI;

        System.out.println("Given:");
        System.out.println("Radius = " + radius);

        System.out.println("\nComputing for Circumference...");
        double circumference = 2 * pi * radius;
        System.out.printf("Circumference = %.4f cm\n", circumference);

        double area = pi * Math.pow(radius, 2);
        System.out.println("\nComputing for the Area...");
        System.out.printf("Result = %.4f cm\n ", area);

    }
}
