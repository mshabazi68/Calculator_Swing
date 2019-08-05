/*
	@author Mohammadreza Shahbazi Jalali
	Due date : 9/18/2018
	Class name: Comp 585
	Purpose : This Class will initiate the KeyListener which is for mouse click.
 */
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ListenerAction extends Component implements ActionListener {
    private KeyListener keyListener;
    //Objects
    private FrameSwing swingCalculator = new FrameSwing();
    private Calculation compute = new Calculation();
    private GetString getString = new GetString();
    //Variables
    private boolean isNewEntry = true;
    private boolean isInitialExecution = true;
    private String operatorPressed;


// method for mouse listener
    @Override
    public void actionPerformed(ActionEvent e) {


        String key = e.getActionCommand();
        String keyString = swingCalculator.text.getText();
        if (key.equals("\n") || key.equals("=") ) {
            keyString = compute.searchPranteste(keyString);
        }
        else{
            keyString = getString.getText(key,keyString);
        }
        swingCalculator.text.setText(keyString);
    }


 //Quick and dirty way to find double of the same operator
    
}


