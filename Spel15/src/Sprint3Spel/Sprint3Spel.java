package Sprint3Spel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.*;

public class Sprint3Spel extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JPanel game = new JPanel();
    Button newGame = new Button("Nytt spel");
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
    Button sixteen = new Button(" ");
    Button tempEmpty = new Button(" ");
    protected int emptyValue;
    protected boolean hasWon = false;
    List<Button> buttonList = new ArrayList<>();

    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000, 50);
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH);
        panel.add(newGame);
        game.setLayout(new GridLayout(4, 4));
        startNewGame();    // crates all buttons, adds to game
        newGame.addActionListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    public void checkIfWon() {      // Kollar att knapparna ligger i ordning
        String allNumbers = "";     // och man har vunnit
        for (Button b : buttonList) {
            allNumbers += b.getText();
        }
        if (allNumbers.trim().equals("123456789101112131415")) {
            hasWon = true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            startNewGame();
            hasWon = false;
        } else if (e.getSource().equals(one)) {
            if(one.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(one);
            one.makeEmpty();
            tempEmpty = one;
            }
        } else if (e.getSource().equals(two)) {
            if(two.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(two);
            two.makeEmpty();
            tempEmpty = two;
            }
        } else if (e.getSource().equals(three)) {
            if(three.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(three);
            three.makeEmpty();
            tempEmpty = three;
            }
        } else if (e.getSource().equals(four)) {
            if(four.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(four);
            four.makeEmpty();
            tempEmpty = four;
            }
        } else if (e.getSource().equals(five)) {
            if(five.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(five);
            five.makeEmpty();
            tempEmpty = five;
            }
        } else if (e.getSource().equals(six)) {
            if(six.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(six);
            six.makeEmpty();
            tempEmpty = six;
            }
        } else if (e.getSource().equals(seven)) {
            if(seven.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(seven);
            seven.makeEmpty();
            tempEmpty = seven;
            }
        } else if (e.getSource().equals(eight)) {
            if(eight.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(eight);
            eight.makeEmpty();
            tempEmpty = eight;
            }
        } else if (e.getSource().equals(nine)) {
            if(nine.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(nine);
            nine.makeEmpty();
            tempEmpty = nine;
            }
        } else if (e.getSource().equals(ten)) {
            if(ten.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(ten);
            ten.makeEmpty();
            tempEmpty = ten;
            }
        } else if (e.getSource().equals(eleven)) {
            if(eleven.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(eleven);
            eleven.makeEmpty();
            tempEmpty = eleven;
            }
        } else if (e.getSource().equals(twelve)) {
            if(twelve.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(twelve);
            twelve.makeEmpty();
            tempEmpty = twelve;
            }
        } else if (e.getSource().equals(thirteen)) {
            if(thirteen.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(thirteen);
            thirteen.makeEmpty();
            tempEmpty = thirteen;
            }
        } else if (e.getSource().equals(fourteen)) {
            if(fourteen.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(fourteen);
            fourteen.makeEmpty();
            tempEmpty = fourteen;
            }
        } else if (e.getSource().equals(fifteen)) {
            if(fifteen.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(fifteen);
            fifteen.makeEmpty();
            tempEmpty = fifteen;
            }
        } else if (e.getSource().equals(sixteen)) {
            if(sixteen.isNextTo(tempEmpty.getNumValue())){
            tempEmpty.setValues(sixteen);
            sixteen.makeEmpty();
            tempEmpty = sixteen;
            }
        }
        checkIfWon();  // kollar om man vunnit
        if (hasWon) {
           newGame.setWinText(); // ändrar newGame's text till "Grattis!"
           hasWon = false;
        }

    }

    public void startNewGame() {            // blandar knapparna och lägger till
        buttonList = createButtonList();    // dem till spelet
        newGame.setText("Nytt spel");
        Collections.shuffle(buttonList);         // TEST - kommentera bort
        for (int i = 0; i < buttonList.size(); i++) {
            buttonList.get(i).setNumValue(i + 1);
        }
        for(Button b: buttonList){
            b.setPreferredSize(new Dimension(80, 60));
            b.setFont(new Font("Helvetica", Font.BOLD, 20));
            game.add(b);
            b.addActionListener(this);
        }    
        tempEmpty = sixteen;
                                              //Test att spelet funkar
//            tempEmpty.setValues(twelve);    // TEST
//            twelve.makeEmpty();             // TEST
//            tempEmpty = twelve;             // TEST
    }

    public List<Button> createButtonList() { // skapar lista med alla buttons
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
        sixteen.makeEmpty();

        return buttonList;
    }

    public static void main(String[] args) {
        Sprint3Spel sp = new Sprint3Spel();
    }
}
