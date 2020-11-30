package semester_one.week_fifteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The game class of the {@link TicTacToe} application.
 *
 * @author Michael Muzzarelli
 * @since November 30, 2020
 */
public class Game {

    private static final int GRID_SIZE = 3;

    private JFrame window;
    private JPanel mPanel;
    private ButtonListener listener;
    private JButton[] grid;
    private Font buttonFont;
    private boolean playerX;

    public Game() {
        // construct the window
        window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);

        // define the font
        buttonFont = new Font("Arial", Font.BOLD, 120);

        // define the player turn
        playerX = true;

        // define the listener
        listener = new ButtonListener();

        // construct the panel
        mPanel = new JPanel();
        mPanel.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        mPanel.setBackground(Color.LIGHT_GRAY);

        // construct the buttons
        grid = new JButton[GRID_SIZE * GRID_SIZE];

        for (int i = 0; i < grid.length; i++) {
            grid[i] = new JButton();
            grid[i].setFont(buttonFont);
            grid[i].addActionListener(listener);
        }

        // add components to the panel
        for (JButton b : grid) {
            mPanel.add(b);
        }

        // add panel to the window
        window.add(mPanel);

        // set the window visibility
        window.setVisible(true);
    }

    // different methods to creating listeners
    //      a) create an instance of a listener class
    //      b) bind an anonymous instance of a listener class to a graphical component
    //      c) combine an anonymous class when registering the listener
    //      d) use lambda expressions

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();

            if (button.getText().equals("")) {
                if (playerX) {
                    button.setText("X");
                } else {
                    button.setText("O");
                }

                playerX = !playerX;
            }

            checkWinner();
        }
    }

    private boolean checkWinner() {
        if (grid[0].getText().equals(grid[1].getText()) &&
            grid[0].getText().equals(grid[2].getText())) {
            System.out.println("Winner!");
        }

        return false;
    }
}