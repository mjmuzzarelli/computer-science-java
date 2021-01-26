package semester_two.week_two.gui;

import javax.swing.*;

public class GUI {

    private JFrame frame;
    private Space space;

    public GUI() {
        // create the frame and set properties
        frame = new JFrame("GUI Demonstration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // create the space panel
        space = new Space();

        // add components to the frame and set visible
        frame.add(space);
        frame.setVisible(true);
    }
}