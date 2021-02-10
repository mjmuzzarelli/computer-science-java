package semester_two.assignment;

import javax.swing.*;
import java.awt.*;

public class Background extends Rectangle {

    private final Image image;

    public Background(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = new ImageIcon("src/main/resources/orchard.png").getImage();
    }

    public Image getImage() {
        return image;
    }
}