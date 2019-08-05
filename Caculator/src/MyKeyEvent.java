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
      //  displayInfo(e, "KEY TYPED: ");
    }


    public void keyPressed(KeyEvent e) {
        //displayInfo(e, "KEY PRESSED: ");
    }

    public void keyReleased(KeyEvent e) {
        //displayInfo(e, "KEY RELEASED: ");
    }

}
