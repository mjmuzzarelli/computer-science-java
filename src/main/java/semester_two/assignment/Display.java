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

        private int applesCreated = 0;

        @Override
        public void actionPerformed(ActionEvent e) {

            if (orchard.moveApples()) {
                if (applesCreated < 10) {
                    orchard.getApples().add(new Apple(random.nextInt(870),
                            random.nextInt(100) - 200,
                            30, 30, 4, Color.RED));
                } else if (applesCreated >= 10 && applesCreated < 20) {
                    orchard.getApples().add(new Apple(random.nextInt(870),
                            random.nextInt(100) - 200,
                            30, 30, 8, Color.RED));
                } else if (applesCreated >= 20) {
                    orchard.getApples().add(new Apple(random.nextInt(870),
                            random.nextInt(100) - 200,
                            30, 30, 10, Color.RED));
                }

                applesCreated++;

                System.out.println(applesCreated);
            } else {
                appleCreationTimer.stop();
            }
        }
    }
}
