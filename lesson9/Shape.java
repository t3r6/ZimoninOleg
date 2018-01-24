package lesson9;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Share{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        return color != null ? color.equals(shape.color) : shape.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }


    public abstract void draw();
}

