/*
	@author Mohammadreza Shahbazi Jalali
	Class name: Comp 585
	Purpose : Frame class
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameSwing extends JFrame {

    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_WIDTH = 400;
    public KeyListener keyListener;
    public static JTextField text;
    private final Font LARGE_FONT = new Font(Font.SERIF, Font.BOLD, 34);
    private final Font MIDEUM_FONT = new Font(Font.SERIF, Font.BOLD, 24);
    private JButton btn;
    private JPanel panel;
    private JLabel label;
    private JMenuBar menubar;
    private JMenu help;
    private JMenu home;
    private JMenuItem exit;
    private JMenuItem about;
    private KeyListener newkey;
  //  private Object ListenerAction;

    public FrameSwing() {
    }
// it the constructor and the rest is self explanatory
    public FrameSwing(String title) {
        creatMenu();
        creatTextfiled();
        creatpanel();
        creatFrame(title);
        creatGridlayout();
        addMenuListeners();
    }

    // helper method for creating frame
    private void creatFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        setResizable(false);
        setJMenuBar(menubar);
    }
// creating panel method is self explanatory
    private void creatpanel() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(text, BorderLayout.NORTH);
        panel.add(creatGridlayout(), BorderLayout.CENTER);

        add(panel);
    }
// Creating menu and adding to panel at the same time.
    private void creatMenu() {
        menubar = new JMenuBar();
        help = new JMenu("Help");
        home = new JMenu("Home");
        exit = new JMenuItem("EXIT");
        about = new JMenuItem("About app");
        home.add(exit);
        help.add(about);
        menubar.add(home);
        menubar.add(help);
        //setMenuBar(menubar);
    }
    private void addMenuListeners(){
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                exitActionPerformed();
            }
        });
        about.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                aboutActionPerformed();
            }
        });
    }
    private void exitActionPerformed(){
       dispose();
    }
    private void aboutActionPerformed(){
        JOptionPane.showMessageDialog(this, "My first calculator");
    }
}