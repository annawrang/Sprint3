import Sprint3Spel.Button;
import junit.framework.TestCase;
import org.junit.Test;

import Sprint3Spel.Sprint3Spel;
import java.util.ArrayList;
import java.util.List;

public class Sprint3SpelTest {
    Sprint3Spel s = new Sprint3Spel();
    String correct = "123456789101112131415";
    boolean hasWon;
    protected String allNumbers = "";
    List<Button> buttonList = new ArrayList<>();
    @Test
    public final void Sprint3SpelTest(){
        
         TestCase.assertTrue(checkIfWon1(correct) == true);
    }

    private boolean checkIfWon1(String correct) {
        allNumbers = "";
        for (Button b : buttonList) {
            allNumbers += b.getText();
        }
        if (allNumbers.trim().equals("123456789101112131415")) {
            hasWon = true;
        }
        return hasWon;
    }
    
    
}
