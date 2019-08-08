/*
	@author Mohammadreza Shahbazi Jalali

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


    }


 //Quick and dirty way to find double of the same operator
    public static boolean hasInvalidOperators(String str) {
        int dotCount = 0, percentCount = 0;
        int negativeCount = 0, digitCount = 0;
        int invalidCount = 2;
        boolean hasDoubles = false;

        //each operator should not be used more than once i.e. -12.34%

        for (char c : str.toCharArray())
        {
            if (c == '.') {
                dotCount++;
            } else if (c == '%') {
                percentCount++;
            } else if (c == '-') {
                negativeCount++;
            }
            //Make sure a digit is entered
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (dotCount >= invalidCount || percentCount >= invalidCount ||
                negativeCount >= invalidCount || digitCount == 0) {
            hasDoubles = true;
        }
        return hasDoubles;
    }
}



 //Quick and dirty way to find double of the same operator
    public static boolean hasInvalidOperators(String str) {
        int dotCount = 0, percentCount = 0;
        int negativeCount = 0, digitCount = 0;
        int invalidCount = 2;
        boolean hasDoubles = false;

        //each operator should not be used more than once i.e. -12.34%

        for (char c : str.toCharArray())
        {
            if (c == '.') {
                dotCount++;
            } else if (c == '%') {
                percentCount++;
            } else if (c == '-') {
                negativeCount++;
            }
            //Make sure a digit is entered
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (dotCount >= invalidCount || percentCount >= invalidCount ||
                negativeCount >= invalidCount || digitCount == 0) {
            hasDoubles = true;
        }
        return hasDoubles;
    }
}


