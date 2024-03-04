import javax.swing.*;

public class Tester {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Blast them");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AsteroidPanel panel = new AsteroidPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
