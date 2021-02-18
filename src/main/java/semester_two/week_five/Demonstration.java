package semester_two.week_five;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demonstration {

    private JFrame frame;
    private Display panel;
    private Timer timer;

    public Demonstration() {
        frame = new JFrame("Listener Demonstration");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new Display();

        timer = new Timer(1000, new TimerMovementListener());

        frame.add(panel);

        frame.addKeyListener(new KeyboardMovementListener());

        frame.setVisible(true);

        timer.start();
    }

    private class TimerMovementListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.update();
        }
    }

    private class KeyboardMovementListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
//            System.out.println("TYPED : " + e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                panel.changeLoc(0, -3);
            } else if (e.getKeyCode() == KeyEvent.VK_A) {
                panel.changeLoc(-3, 0);
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                panel.changeLoc(0, 3);
            } else if (e.getKeyCode() == KeyEvent.VK_D) {
                panel.changeLoc(3, 0);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("RELEASED : " + e.getKeyChar());
        }
    }
}