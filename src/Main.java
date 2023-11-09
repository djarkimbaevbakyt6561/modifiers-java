public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 41;
        double resultArea = Circle.area(circle.radius);
        double resultCircumferen = Circle.circumferen(circle.radius);
        System.out.println(resultArea);
        System.out.println(resultCircumferen);
    }
}