public class Square extends Quadrangle implements Figure {
    public Square(int a, String color) {
        super(a, a, color);

    }

    @Override
    public double getLargeDiagonal() {
        return a * Math.sqrt(2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
