package semester_two.week_two.gui;

import javax.swing.*;
import java.awt.*;

public class Space extends JPanel {

    private final Color BROWN = new Color(150, 75, 0);

    public Space() {
        super();

        setBackground(Color.MAGENTA);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.YELLOW);
        g2.fillOval(200, 200, 50, 50);
        g2.setColor(BROWN);
        g2.drawOval(200, 200, 50, 50);
        g2.setColor(Color.BLUE.brighter());
        g2.fillOval(400, 400, 50, 50);
        g2.setColor(BROWN);
        g2.drawOval(400, 400, 50, 50);
        g2.setColor(Color.CYAN);
        g2.drawRect(600, 100, 90, 90);
        g2.drawRect(600, 250, 140, 70);
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Calibri", Font.PLAIN, 35));
        g2.drawString("First Graphics Program", 20, 40);
    }
}