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
    4. Akinyi: Jag fortsätter att jobba på actionPerformed när en knapp trycks 
      samt hur vi ska byta plats med den tomma. Du ligger särkert före i detta:)
    5. Anna: Jag tror jag kommit på ett sätt att lösa byt-btick-grejen, men det är
    ingen snygg lösning. Jag kan testa det i en ny branch och om det funkar visar jag dig :)
    Mitt problem är att jag aldrig lyckas nå den tomma rutan i ett actionPerformed,
    troligtvis för att jag försöker nå den genom en lista. Därför tänkte jag testa
    att sätta ditt en temp-knapp som alltid får värdet av den knappen som blir svart,
    så kan man nå den tomma knappen utan att behöva gå genom en forloop och en lista.

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
    Button temp = new Button("");
    List<Button> buttonList = new ArrayList<>();

    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000,50);
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH); 
        panel.add(newGame);
     
        game.setLayout(new GridLayout(4,4));
        startNewGame();
        newGame.addActionListener(this);
        
        for(Button b: buttonList){   // Ännu mer kompakt?
            b.addActionListener(this);
        }

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
