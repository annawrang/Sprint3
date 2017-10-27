package Sprint3Spel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.swing.*;

/* 
    Vi behöver 
    1 Anna: ActionListener - anonym klass kanske? -Akiny: Done
    2.Anna: sätta ut actionListeners för alla knappar - Akinyi: done
    3. Akinyi: Se småkommentarer nedan
    4. Akinyi: Jag fortsätter att jobba på actionPerformed när en knapp trycks 
      samt hur vi ska byta plats med den tomma. Du ligger särkert före i detta:)

*/

public class Sprint3Spel extends JFrame implements ActionListener{

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
    List<Button> buttonList = new ArrayList<>();

    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000,50); //Vill kunna nå spelet medans jag testar det
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH); 
        panel.add(newGame);
     
        game.setLayout(new GridLayout(4,4));
        startNewGame();
        newGame.addActionListener(this);
        one.addActionListener(this);  two.addActionListener(this); //Mera kompakt?
        three.addActionListener(this);four.addActionListener(this);
        five.addActionListener(this); six.addActionListener(this);
        seven.addActionListener(this);eight.addActionListener(this);
        nine.addActionListener(this); ten.addActionListener(this);
        eleven.addActionListener(this);twelve.addActionListener(this);
        thirteen.addActionListener(this);fourteen.addActionListener(this);
        fifteen.addActionListener(this);sixteen.addActionListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }
     
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== newGame)
        startNewGame();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    public void startNewGame(){
        buttonList = createButtonList();
        Collections.shuffle(buttonList);
        for(Button b: buttonList)
            game.add(b);
     
    }
    
    

    public List<Button> createButtonList() {
        buttonList = new ArrayList<>();
        buttonList.add(one);
        one.setText("1");
        one.setBackground(Color.CYAN);
        buttonList.add(two);
        two.setText("2");
        two.setBackground(Color.CYAN);
        buttonList.add(three);
        three.setText("3");
        three.setBackground(Color.CYAN);
        buttonList.add(four);
        four.setText("4");
        four.setBackground(Color.CYAN);
        buttonList.add(five);
        five.setText("5");
        five.setBackground(Color.CYAN);
        buttonList.add(six);
        six.setText("6");
        six.setBackground(Color.CYAN);
        buttonList.add(seven);
        seven.setText("7");
        seven.setBackground(Color.CYAN);
        buttonList.add(eight);
        eight.setText("8");
        eight.setBackground(Color.CYAN);
        buttonList.add(nine);
        nine.setText("9");
        nine.setBackground(Color.CYAN);
        buttonList.add(ten);
        ten.setText("10");
        ten.setBackground(Color.CYAN);
        buttonList.add(eleven);
        eleven.setText("11");
        eleven.setBackground(Color.CYAN);
        buttonList.add(twelve);
        twelve.setText("12");
        twelve.setBackground(Color.CYAN);
        buttonList.add(thirteen);
        thirteen.setText("13");
        thirteen.setBackground(Color.CYAN);
        buttonList.add(fourteen);
        fourteen.setText("14");
        fourteen.setBackground(Color.CYAN);
        buttonList.add(fifteen);
        fifteen.setText("15");
        fifteen.setBackground(Color.CYAN);
        buttonList.add(sixteen);
        sixteen.setText(" ");
        sixteen.setBackground(Color.BLACK);

        return buttonList;
    }

    public static void main(String[] args) {
        Sprint3Spel sp = new Sprint3Spel();
    }
}
