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
public class Sprint3Spel extends JFrame implements ActionListener {

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
    Button tempEmpty = new Button(""); // Den här ska alltid ha värdet av empty(sixteen till att börja med),
                                        // vilket ges till knappen som blir tryckt på.

    List<Button> buttonList = new ArrayList<>();
    // Har lagt till variabler row och col och en final N som används för att
    // definiera index. Och en metod getGridButton som möjligtvis kan användas i ActionPerformed längre ner
    private static final int N = 4;
    int row; int col;
    // A method to find the index of the grid button
    private JButton getGridButton(int r, int c) {
        int index = r * N + c;
        return buttonList.get(index);
    }
    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000, 50);
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH);
        panel.add(newGame);

        game.setLayout(new GridLayout(4, 4));
        startNewGame();
        newGame.addActionListener(this);

        for (Button b : buttonList) {   // Ännu mer kompakt?
            b.addActionListener(this);
        }

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }
// Inkomplete metod som ska kunna användas för att hitta position för knappen tryckt och tomma knappen
    private JButton createGridButton(final int row, final int col) {
        final JButton b = new JButton("r" + row + ",c" + col);
    //    b.addActionListener(new ActionListener(this)); Funkar inte ännu
     return b;
    }
    
    public void actionPerformed(ActionEvent e) {
           JButton gb = this.getGridButton(row, col);

                 
    if(e.getSource()== one && e.getSource()== two && e.getSource()== three &&
       e.getSource()== four && e.getSource()== five && e.getSource()== six &&
       e.getSource()== seven && e.getSource()== eight && e.getSource()== nine &&
       e.getSource()== ten && e.getSource()== eleven && e.getSource()== twelve && 
       e.getSource()== thirteen && e.getSource()== fourteen && e.getSource()== fifteen){
       System.out.println("r" + row + ",c" + col + " " + (e.getSource() == gb));
    } 
        if (e.getSource() == newGame) {
            startNewGame();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
        } else if (e.getSource().equals(one)) {    // TempEmpty får ones värde. One's värden blir tom text + svar. tempEmpty pekar på one.
            // Här skulle vi kunna anropa en metod som visar gridpositionen av sixteen om en knapp trycks 
            // jämför med tomma knappen.
            /*
             JButton gb = this.getGridButton(row, col);
            */
            tempEmpty.setText(one.getText());
            tempEmpty.setBackground(one.getBackground());
            one.setBackground(Color.BLACK);
            one.setText(" ");
            tempEmpty = one; 
        }
        else if(e.getSource().equals(two)){
            tempEmpty.setText(two.getText());
            tempEmpty.setBackground(two.getBackground());
            two.setBackground(Color.BLACK);
            two.setText(" ");
            tempEmpty = two;
        }
        else if(e.getSource().equals(three)){
            tempEmpty.setText(three.getText());
            tempEmpty.setBackground(three.getBackground());
            three.setBackground(Color.BLACK);
            three.setText(" ");
            tempEmpty = three;
        }
        else if(e.getSource().equals(four)){
            tempEmpty.setText(four.getText());
            tempEmpty.setBackground(four.getBackground());
            four.setBackground(Color.BLACK);
            four.setText(" ");
            tempEmpty = four;
        }
        else if(e.getSource().equals(five)){
            tempEmpty.setText(five.getText());
            tempEmpty.setBackground(five.getBackground());
            five.setBackground(Color.BLACK);
            five.setText(" ");
            tempEmpty = five;
        }
        else if(e.getSource().equals(six)){
            tempEmpty.setText(six.getText());
            tempEmpty.setBackground(six.getBackground());
            six.setBackground(Color.BLACK);
            six.setText(" ");
            tempEmpty = six;
        }
        else if(e.getSource().equals(seven)){
            tempEmpty.setText(seven.getText());
            tempEmpty.setBackground(seven.getBackground());
            seven.setBackground(Color.BLACK);
            seven.setText(" ");
            tempEmpty = seven;
        }
        else if(e.getSource().equals(eight)){
            tempEmpty.setText(eight.getText());
            tempEmpty.setBackground(eight.getBackground());
            eight.setBackground(Color.BLACK);
            eight.setText(" ");
            tempEmpty = eight;
        }
        else if(e.getSource().equals(nine)){
            tempEmpty.setText(nine.getText());
            tempEmpty.setBackground(nine.getBackground());
            nine.setBackground(Color.BLACK);
            nine.setText(" ");
            tempEmpty = nine;
        }  
        else if(e.getSource().equals(ten)){
            tempEmpty.setText(ten.getText());
            tempEmpty.setBackground(ten.getBackground());
            ten.setBackground(Color.BLACK);
            ten.setText(" ");
            tempEmpty = ten;
        } 
        else if(e.getSource().equals(eleven)){
            tempEmpty.setText(eleven.getText());
            tempEmpty.setBackground(eleven.getBackground());
            eleven.setBackground(Color.BLACK);
            eleven.setText(" ");
            tempEmpty = eleven;
        }       
        else if(e.getSource().equals(twelve)){
            tempEmpty.setText(twelve.getText());
            tempEmpty.setBackground(twelve.getBackground());
            twelve.setBackground(Color.BLACK);
            twelve.setText(" ");
            tempEmpty = twelve;
        }   
        else if(e.getSource().equals(thirteen)){
            tempEmpty.setText(thirteen.getText());
            tempEmpty.setBackground(thirteen.getBackground());
            thirteen.setBackground(Color.BLACK);
            thirteen.setText(" ");
            tempEmpty = thirteen;
        }   
        else if(e.getSource().equals(fourteen)){
            tempEmpty.setText(fourteen.getText());
            tempEmpty.setBackground(fourteen.getBackground());
            fourteen.setBackground(Color.BLACK);
            fourteen.setText(" ");
            tempEmpty = fourteen;
        }           
        else if(e.getSource().equals(fifteen)){
            tempEmpty.setText(fifteen.getText());
            tempEmpty.setBackground(fifteen.getBackground());
            fifteen.setBackground(Color.BLACK);
            fifteen.setText(" ");
            tempEmpty = fifteen;
        }         
        else if(e.getSource().equals(sixteen)){
            tempEmpty.setText(sixteen.getText());
            tempEmpty.setBackground(sixteen.getBackground());
            sixteen.setBackground(Color.BLACK);
            sixteen.setText(" ");
            tempEmpty = sixteen;
        }      
        
        
    }

    public void startNewGame() {
        buttonList = createButtonList();
        Collections.shuffle(buttonList);
        for (Button b : buttonList) {
            game.add(b);
        }
        tempEmpty = sixteen;
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
