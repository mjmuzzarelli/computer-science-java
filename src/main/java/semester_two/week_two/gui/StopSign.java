package semester_two.week_two.gui;

import java.awt.*;

public class StopSign extends Polygon {

    private int length;

    public StopSign(int x, int y, int len) {
        xpoints = new int[8];
        ypoints = new int[8];
        npoints = 8;
        length = len;
        int a =  (int) (0.7 * len);

        xpoints[0] = x + a;
        ypoints[0] = y;
        xpoints[1] = x + a + length;
        ypoints[1] = y;
        xpoints[2] = x + (2 * a) + length;
        ypoints[2] = y + a;
        xpoints[3] = x + a + a + length;
        ypoints[3] = y + a + length;
        xpoints[4] = x + a + length;
        ypoints[4] = y + a + a + length;
        xpoints[5] = x + a;
        ypoints[5] = y + a + a + length;
        xpoints[6] = x;
        ypoints[6] = y + a + length;
        xpoints[7] = x;
        ypoints[7] = y + a;
    }

    public StopSign() {
        this(0, 0, 50);
    }
}