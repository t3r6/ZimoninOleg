package lesson9;

public class CircleSensei {
    private double radius;
    private static final double PI = 3.14159265358979;

    public CircleSensei(double radius) {
        this.radius = radius;
    }

    public CircleSensei() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CircleSensei that = (CircleSensei) o;

        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "CircleSensei{" +
                "radius=" + radius +
                '}';
    }

    public void circleContent(double radius) {
        double circleContentResult = PI * radius * radius;
        System.out.println("Площадь окружности при радиусе " + radius + " равна " + circleContentResult);
    }

    public void lengthOfCircumferenceOfACircle(double radius) {
        double lengthOfCircumferenceOfACircleResult = 2 * PI * radius;
        System.out.println("Длина окружности при радиусе " + radius + " равна " + lengthOfCircumferenceOfACircleResult);
    }
}
