package lesson9;

public class Circle extends Shape {
    private int x, y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y) {
        super("Red");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        return y == circle.y;
    }


    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor());
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("yellow", 8, 9);
        shapes[1] = new Circle("red", 1, 2);
        shapes[2] = new Rectangle("green", 5, 6);
        shapes[3] = new Rectangle("black", 3, 3);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
