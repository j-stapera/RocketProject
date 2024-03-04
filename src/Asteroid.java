import javax.swing.*;
import java.awt.*;

public class Asteroid implements MoveableObject {

    private ImageIcon meteor;
    private JPanel canvas;
    private int x, y;

    public Asteroid (JPanel canvas, int x, int y) {
        this.canvas = canvas;
        meteor = new ImageIcon("smile.png");
        this.x = x; //canvas.getWidth()/2;
        this.y = y; //(int)(Math.random() * canvas.getHeight());
    }
    @Override
    public void draw(Graphics2D g2) {
        meteor.paintIcon(canvas, g2, x, y);
    }

    @Override
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;



    }

    public int getHeight() {
        return meteor.getIconHeight();
    }
}
