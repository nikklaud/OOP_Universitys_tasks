class Rectangle extends Shape {
    int x1, y1, x2, y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.println("Рисуем прямоугольник цвета " + color + " с координатами (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ")");
    }
}