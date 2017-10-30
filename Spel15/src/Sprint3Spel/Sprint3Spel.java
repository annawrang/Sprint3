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
import java.util.Locale;
import javax.swing.*;

/* 
    Vi behöver 
    4. Akinyi: Jag implementerar en metod som ser till att bara knapparna brevid 
                tomrummet byts

    5. Anna:  jag la till några metoder som räknar ut om man har vunnit och då
                skriver ut det som meddelande :) OBS - jag ändrade i startNewGame
                för att testa metoden, när du testat kan vi ändra tillbaka

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
    Button tempEmpty = new Button("");
    protected int emptyValue;
    protected boolean hasWon = false;
    protected String allNumbers = "";
    List<Button> buttonList = new ArrayList<>();

    public Sprint3Spel() {
        this.setLayout(new BorderLayout());
        this.setLocation(1000, 50);
        this.add(panel, BorderLayout.SOUTH);
        this.add(game, BorderLayout.NORTH);
        panel.add(newGame);

        game.setLayout(new GridLayout(4, 4));
        startNewGame();
        newGame.addActionListener(this);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }

    public void checkIfWon() {  // Kollar att knapparna ligger i ordning
        allNumbers = "";
        for (Button b : buttonList) {
            allNumbers += b.getText();
        }
        if (allNumbers.trim().equals("123456789101112131415")) {
            hasWon = true;
        }
    }
//// TEST METOD
//    private boolean checkIfWon1(String correct) {
//        allNumbers = "";
//        for (Button b : buttonList) {
//            allNumbers += b.getText();
//        }
//        if (allNumbers.trim().equals("123456789101112131415")) {
//            hasWon = true;
//        }
//        return hasWon;
//    }
    
    
    
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGame) {
            newGame.setText("Nytt spel");
            startNewGame();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        } 
        
    if(e.getSource()== one || e.getSource()== two || e.getSource()== three ||
         e.getSource()== four || e.getSource()== five || e.getSource()== six ||
         e.getSource()== seven || e.getSource()== eight || e.getSource()== nine ||
         e.getSource()== ten || e.getSource()== eleven || e.getSource()== twelve || 
         e.getSource()== thirteen || e.getSource()== fourteen || e.getSource()== fifteen){
           int n = getSixteensIndex(); 
           
//        for(int i=0; i<buttonList.size(); i++){
//         if(e.getSource() ==(JButton)buttonList.get(i) ){
        while(nextTo()== true){
           try{
         if(e.getSource() == (JButton)buttonList.get(n-1) || 
            e.getSource() == (JButton)buttonList.get(n+1) ||
            e.getSource()== (JButton)buttonList.get(n-4) || 
            e.getSource() == (JButton)buttonList.get(n+4)){
             
        // Put all your exchanges of buttons here
        if (e.getSource().equals(one)) {
            tempEmpty.setValues(one);
            one.makeEmpty();
            tempEmpty = one;
        } else if (e.getSource().equals(two)) {
//            buttonList.set(n, two);
//            buttonList.set(i, sixteen);
            tempEmpty.setValues(two);
            two.makeEmpty();
            tempEmpty = two;
        } else if (e.getSource().equals(three)) {
//            buttonList.set(n, three);
//            buttonList.set(i, sixteen);
            tempEmpty.setValues(three);
            three.makeEmpty();
            tempEmpty = three;
        } else if (e.getSource().equals(four)) {
            tempEmpty.setValues(four);
            four.makeEmpty();
            tempEmpty = four;
        } else if (e.getSource().equals(five)) {
            tempEmpty.setValues(five);
            five.makeEmpty();
            tempEmpty = five;
        } else if (e.getSource().equals(six)) {
            tempEmpty.setValues(six);
            six.makeEmpty();
            tempEmpty = six;
        } else if (e.getSource().equals(seven)) {
            tempEmpty.setValues(seven);
            seven.makeEmpty();
            tempEmpty = seven;
        } else if (e.getSource().equals(eight)) {
            tempEmpty.setValues(eight);
            eight.makeEmpty();
            tempEmpty = eight;
        } else if (e.getSource().equals(nine)) {
            tempEmpty.setValues(nine);
            nine.makeEmpty();
            tempEmpty = nine;
        } else if (e.getSource().equals(ten)) {
            tempEmpty.setValues(ten);
            ten.makeEmpty();
            tempEmpty = ten;
        } else if (e.getSource().equals(eleven)) {
            tempEmpty.setValues(eleven);
            eleven.makeEmpty();
            tempEmpty = eleven;
        } else if (e.getSource().equals(twelve)) {
            tempEmpty.setValues(twelve);
            twelve.makeEmpty();
            tempEmpty = twelve;
        } else if (e.getSource().equals(thirteen)) {
            tempEmpty.setValues(thirteen);
            thirteen.makeEmpty();
            tempEmpty = thirteen;
        } else if (e.getSource().equals(fourteen)) {
            tempEmpty.setValues(fourteen);
            fourteen.makeEmpty();
            tempEmpty = fourteen;
        } else if (e.getSource().equals(fifteen)) {
            tempEmpty.setValues(fifteen);
            fifteen.makeEmpty();
            tempEmpty = fifteen;
        } else if (e.getSource().equals(sixteen)) {
            tempEmpty.setValues(sixteen);
            sixteen.makeEmpty();
            tempEmpty = sixteen;
        }
         }
           }catch(ArrayIndexOutOfBoundsException aiob){
            }
           catch(IndexOutOfBoundsException iob){
           }
           
        }
    // }         
        
//        else if (e.getSource().equals(one)) {
//            tempEmpty.setValues(one);
//            one.makeEmpty();
//            tempEmpty = one;
//        } else if (e.getSource().equals(two)) {
//            tempEmpty.setValues(two);
//            two.makeEmpty();
//            tempEmpty = two;
//        } else if (e.getSource().equals(three)) {
//            tempEmpty.setValues(three);
//            three.makeEmpty();
//            tempEmpty = three;
//        } else if (e.getSource().equals(four)) {
//            tempEmpty.setValues(four);
//            four.makeEmpty();
//            tempEmpty = four;
//        } else if (e.getSource().equals(five)) {
//            tempEmpty.setValues(five);
//            five.makeEmpty();
//            tempEmpty = five;
//        } else if (e.getSource().equals(six)) {
//            tempEmpty.setValues(six);
//            six.makeEmpty();
//            tempEmpty = six;
//        } else if (e.getSource().equals(seven)) {
//            tempEmpty.setValues(seven);
//            seven.makeEmpty();
//            tempEmpty = seven;
//        } else if (e.getSource().equals(eight)) {
//            tempEmpty.setValues(eight);
//            eight.makeEmpty();
//            tempEmpty = eight;
//        } else if (e.getSource().equals(nine)) {
//            tempEmpty.setValues(nine);
//            nine.makeEmpty();
//            tempEmpty = nine;
//        } else if (e.getSource().equals(ten)) {
//            tempEmpty.setValues(ten);
//            ten.makeEmpty();
//            tempEmpty = ten;
//        } else if (e.getSource().equals(eleven)) {
//            tempEmpty.setValues(eleven);
//            eleven.makeEmpty();
//            tempEmpty = eleven;
//        } else if (e.getSource().equals(twelve)) {
//            tempEmpty.setValues(twelve);
//            twelve.makeEmpty();
//            tempEmpty = twelve;
//        } else if (e.getSource().equals(thirteen)) {
//            tempEmpty.setValues(thirteen);
//            thirteen.makeEmpty();
//            tempEmpty = thirteen;
//        } else if (e.getSource().equals(fourteen)) {
//            tempEmpty.setValues(fourteen);
//            fourteen.makeEmpty();
//            tempEmpty = fourteen;
//        } else if (e.getSource().equals(fifteen)) {
//            tempEmpty.setValues(fifteen);
//            fifteen.makeEmpty();
//            tempEmpty = fifteen;
//        } else if (e.getSource().equals(sixteen)) {
//            tempEmpty.setValues(sixteen);
//            sixteen.makeEmpty();
//            tempEmpty = sixteen;
//        }
        checkIfWon();  // kollar om man vunnit
        if (hasWon) {
            changeButtonText(); // ändrar newGame's text till "Grattis!"
        }
    }// This may need to go 
    }

    public void changeButtonText() {
        newGame.setText("Grattis! Du har vunnit!");
    }

    public void startNewGame() {
        buttonList = createButtonList();
        Collections.shuffle(buttonList);
        for (Button b : buttonList) {
            b.setPreferredSize(new Dimension(80, 60));
            b.setFont(new Font("Helvetica", Font.BOLD, 20));
            game.add(b);
            b.addActionListener(this);
        }
        tempEmpty = sixteen;
    }
 public int getSixteensIndex(){
         int position16=0;
         for(int i=0; i<buttonList.size(); i++)
         if(sixteen ==(JButton)buttonList.get(i) )
           position16 = i;
        return position16;
     }
 public int getOtherIndex(){
     int positionOther=0;
     for(int i =0; i<buttonList.size(); i++)
      if(one ==(JButton)buttonList.get(i)||two ==(JButton)buttonList.get(i) ||
       three ==(JButton)buttonList.get(i)||four ==(JButton)buttonList.get(i)||
       five ==(JButton)buttonList.get(i)||six ==(JButton)buttonList.get(i)||
       seven ==(JButton)buttonList.get(i) ||eight ==(JButton)buttonList.get(i)||
       nine ==(JButton)buttonList.get(i) ||ten ==(JButton)buttonList.get(i) ||
       eleven ==(JButton)buttonList.get(i)||twelve ==(JButton)buttonList.get(i) 
       ||thirteen==(JButton)buttonList.get(i) ||fourteen ==(JButton)buttonList.get(i)
       ||fifteen ==(JButton)buttonList.get(i) )
          positionOther = i;
        return positionOther;
 }
  public boolean nextTo(){
   //boolean nextto = true;
   for(int i=0; i<buttonList.size(); i++){
  if(toRightOfGrid() == true && getSixteensIndex()== 0 || getSixteensIndex()== 4 || 
    getSixteensIndex()== 8|| getSixteensIndex()== 12 )
    return false;
  else if(toLeftOfGrid()==true && getSixteensIndex()== 3 || getSixteensIndex()== 7 || 
    getSixteensIndex()== 11|| getSixteensIndex()== 15)
    return false;
   }
      return true;
//  return nextto;
      }
 
 public boolean toRightOfGrid(){
     boolean rightOfGrid = false;
     if(getOtherIndex() == 3 || getOtherIndex() == 7 ||getOtherIndex() == 11 ||
        getOtherIndex() == 15)
      rightOfGrid = true;
         
         return rightOfGrid;
    
 }
 
 public boolean toLeftOfGrid(){
       boolean leftOfGrid = false;
     if(getOtherIndex() == 0 || getOtherIndex() == 4 ||getOtherIndex() == 8 ||
        getOtherIndex() == 12)
      leftOfGrid = true;
         
         return leftOfGrid;
     
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
//if(e.getSource()== one || e.getSource()== two || e.getSource()== three ||
//         e.getSource()== four || e.getSource()== five || e.getSource()== six ||
//         e.getSource()== seven || e.getSource()== eight || e.getSource()== nine ||
//         e.getSource()== ten || e.getSource()== eleven || e.getSource()== twelve || 
//         e.getSource()== thirteen || e.getSource()== fourteen || e.getSource()== fifteen){
//if (e.getSource() == newGame) {
//             startNewGame();
//             setVisible(true);
//             setDefaultCloseOperation(EXIT_ON_CLOSE);
//        int n = getSixteensIndex();
//        for(int i=0; i<buttonList.size(); i++){
//            
//        if(e.getSource() ==(JButton)buttonList.get(i) ){
//           try{
//         if(e.getSource() == (JButton)buttonList.get(n-1) || 
//                 e.getSource() == (JButton)buttonList.get(n+1))
//             System.out.println("Knappen ligger brevid tomma knappen");
//         else if(e.getSource()== (JButton)buttonList.get(n-4) || 
//                 e.getSource() == (JButton)buttonList.get(n+4))
//             System.out.println("Knappen ligger brevid tomma knappen också");
//           }catch(ArrayIndexOutOfBoundsException aiob){
//            }
//           catch(IndexOutOfBoundsException iob){
//           }
//        }
//     }  
// public int getSixteensIndex(){
//         int position=0;
//         for(int i=0; i<buttonList.size(); i++)
// //          for(int j=0; j<buttonList.size(); j++)
//        if(sixteen ==(JButton)buttonList.get(i) )
//           position = i;
//        return position;
//     }
//    

      