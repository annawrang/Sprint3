package Sprint3Spel;

import java.awt.Color;
import javax.swing.*;

public class Button extends JButton{
    
    public Button(){}
    
    public Button(String text){
        super(text);
    }
    
    // Metod man kan anropa som gör knappen man klickar på den nya tomma
    public void newEmpty(){
        this.setBackground(Color.BLACK);
        this.setText(" ");
    }
    
}
