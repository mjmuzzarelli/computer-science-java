package semester_two.assignment;

import java.awt.*;

public class Apple extends Rectangle {

    private Color color;

    private int dY;

    public Apple(int x, int y, int width, int height, int dY, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.dY = dY;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getdY() {
        return dY;
    }

    public int getLowerBound() {
        return y + height;
    }
}