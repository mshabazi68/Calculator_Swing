/*
	@author Mohammadreza Shahbazi Jalali
	Class name: Comp 585
	Purpose : This Class will initiate the keyListener for Keyboard.
 */
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// method for key board listener
public class MyKeyEvent implements KeyListener {
    //Here creating the nobject
    private FrameSwing swingCalculator = new FrameSwing();
    private Calculation compute = new Calculation();
    private GetString getString = new GetString();
    //private GetString getString = new GetString();


    public void keyTyped(KeyEvent e) {
        displayInfo(e, "KEY TYPED: ");
    }

    public void keyPressed(KeyEvent e) {
        //displayInfo(e, "KEY PRESSED: ");
    }

    public void keyReleased(KeyEvent e) {
        //displayInfo(e, "KEY RELEASED: ");
    }
// passing the key String here also the key event
    private void displayInfo(KeyEvent e, String keyStatus) {

        //swingCalculator.text.setText();
        String key = Character.toString(e.getKeyChar());
        String keyString = swingCalculator.text.getText();
        if (key.equals("\n") || key.equals("=") ) {
            keyString = compute.searchPranteste(keyString);
        }
        else{
            keyString = getString.getText(key,keyString);
        }

        swingCalculator.text.setText(keyString);

    }


}


