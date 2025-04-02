public class Circle extends Shape{
    int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Рисуем круг цвета " + color + " с центром в (" + x + ", " + y + ") и радиусом " + radius);
    }
}
