package Sprint3Spel;

import java.awt.Color;
import javax.swing.*;

public class Button extends JButton {

    protected int numValue;

    public Button() {
    }

    public Button(String text) {
        super(text);
    }

    public Button(String text, int numValue) {
        super(text);
        this.numValue = numValue;
    }

    public void makeEmpty() {
        this.setText("");
        this.setBackground(Color.BLACK);
    }

    public void setValues(Button b) {
        this.setText(b.getText());
        this.setBackground(b.getBackground());
    }

    public void setNumValue(int värde) {
        this.numValue = värde;
    }

    public int getNumValue() {
        return numValue;
    }

    public boolean isNextTo(int value) {
        if (this.getNumValue() == (value + 1)
                || this.getNumValue() == (value - 1)
                || this.getNumValue() == (value + 4)
                || this.getNumValue() == (value - 4)) {
            return true;
        }
        return false;
    }
}
