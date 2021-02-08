package semester_two.assignment;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Orchard extends JPanel {

    private Basket basket;
    private ArrayList<Apple> apples;
    private int applesMissed;

    public Orchard() {
        super();

        basket = new Basket(0, 450, 100, 100, Color.BLACK);
        apples = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics = (Graphics2D) g;

        graphics.setColor(basket.getColor());
        graphics.fill(basket);

        for (int i = 0; i < apples.size(); i++) {
            graphics.setColor(apples.get(i).getColor());
            graphics.fill(apples.get(i));

            if (basket.intersects(apples.get(i))) {
                apples.remove(apples.get(i));

                basket.incrementAppleCount();

                System.out.println("Caught: " + basket.getAppleCount() + ", " +
                        "missed " + applesMissed);
            }
        }
    }

    public boolean moveApples() {
        for (Apple a : apples) {
            a.translate(0, a.getdY());
        }

        repaint();

        return true;
    }

    public ArrayList<Apple> getApples() {
        return apples;
    }

    public Basket getBasket() {
        return basket;
    }
}