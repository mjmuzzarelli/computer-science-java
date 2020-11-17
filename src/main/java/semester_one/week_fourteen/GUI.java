package semester_one.week_fourteen;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JFrame window;
    private JButton click;
    private JButton close;
    private JPanel mainPanel;
    private JLabel word;

    public GUI() {
        window = new JFrame();
        click = new JButton();
        close = new JButton();
        mainPanel = new JPanel();
        word = new JLabel();

        init();
    }

    private void init() {
        // set the window properties
        window.setTitle("My First Window");
        // window.setLocation(200, 300);
        window.setSize(400,150);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        // set panel properties (default is a flow layout)
        mainPanel.setBackground(Color.GREEN);

        // set component properties
        click.setText("Click Here");
        close.setText("Close Me");
        close.setBackground(Color.BLUE);
        close.setForeground(Color.WHITE);
        close.setFont(new Font("Arial", Font.PLAIN, 24));
        word.setText("Words go here...");

        // add components to panel
        mainPanel.add(click);
        mainPanel.add(close);
        mainPanel.add(word);

        // add panel to window
        window.add(mainPanel);
    }
}