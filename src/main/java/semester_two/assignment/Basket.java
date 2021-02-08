package semester_two.assignment;

import java.awt.*;

public class Basket extends Polygon {

    private Color color;

    private int appleCount;

    public Basket(int x, int y, int width, int height, Color color) {
        this.xpoints = new int[4];
        this.ypoints = new int[4];
        this.npoints = 4;
        this.color = color;

        xpoints[0] = x;
        ypoints[0] = y;

        xpoints[1] = x + width;
        ypoints[1] = y;

        xpoints[2] = (int) (x + (0.9 * width));
        ypoints[2] = y + height;

        xpoints[3] = (int) (x + (0.1 * width));
        ypoints[3] = y + height;
    }

    public int getLeftBound() {
        return xpoints[0];
    }

    public int getRightBound() {
        return xpoints[1];
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color value) {
        color = value;
    }

    public void incrementAppleCount() {
        appleCount++;
    }

    public void decrementAppleCount() {
        appleCount--;
    }

    public int getAppleCount() {
        return appleCount;
    }

    public void translate(int deltaX) {
        super.translate(deltaX, 0);
    }
}