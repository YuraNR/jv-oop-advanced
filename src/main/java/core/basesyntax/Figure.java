package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDraw {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();

    @Override
    public String toString() {
        return "Figure{"
                + "color='" + color + '\''
                + '}';
    }
}
