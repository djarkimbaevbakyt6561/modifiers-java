public class Circle {
    static double PI = Math.PI;
    double radius;

    public static double area(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public static double circumferen(double radius) {
        return PI * 2 * radius;
    }
}
