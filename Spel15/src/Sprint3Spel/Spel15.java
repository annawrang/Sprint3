package Sprint3Spel;

import java.awt.GridLayout;
import java.util.Locale;
import javax.swing.*;

public class Spel15 extends JFrame {

    JPanel panel = new JPanel();
    JPanel game = new JPanel();
    JButton newGame = new JButton("Nytt spel");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button ten = new Button("10");
    Button eleven = new Button("11");
    Button twelve = new Button("12");
    Button thirteen = new Button("13");
    Button fourteen = new Button("14");
    Button fifteen = new Button("15");
    Button sixteen = new Button("16");

    public Spel15() {
        this.add(panel);
        panel.setLayout(new GridLayout(2, 1));
        panel.add(game);
        panel.add(newGame);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args) {
        Spel15 s15 = new Spel15();
    }
}
