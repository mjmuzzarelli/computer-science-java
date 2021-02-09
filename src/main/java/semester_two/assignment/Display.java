package semester_two.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Display {

    private JFrame frame;
    private Orchard orchard;
    private Timer appleTimer;
    private Timer appleCreationTimer;
    private Random random;

    public Display() {
        frame = new JFrame("Apple Orchard");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 600);

        orchard = new Orchard();
        random = new Random();

        appleTimer = new Timer(100, new AppleTimer());
        appleCreationTimer = new Timer(5000, new AppleCreationTimer());

        frame.addKeyListener(new MovementListener());

        frame.add(orchard);

        frame.setVisible(true);

        appleTimer.start();
        appleCreationTimer.start();
    }

    private class AppleTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!orchard.moveApples()) {
                appleTimer.stop();
            }
        }
    }

    private class MovementListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();

            switch (code) {
                case KeyEvent.VK_D:
                    if (orchard.getBasket().getRightBound() != frame.getWidth()) {
                        orchard.getBasket().translate(10);
                    }
                    break;

                case KeyEvent.VK_A:
                    if (orchard.getBasket().getLeftBound() != 0) {
                        orchard.getBasket().translate(-10);
                    }
                    break;
            }
        }
    }

    private class AppleCreationTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (orchard.moveApples()) {
                orchard.getApples().add(new Apple(random.nextInt(870),
                        random.nextInt(100) - 200,
                        30, 30, random.nextInt(10), Color.RED));
            } else {
                appleCreationTimer.stop();
            }
        }
    }
}
