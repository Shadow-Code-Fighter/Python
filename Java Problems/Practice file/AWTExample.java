import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame {

    public AWTExample() {
        setLayout(new FlowLayout());
        
        Label label = new Label(" MCA Final ");
        add(label);
    
        
        /*Button button = new Button("Click Me");
        add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });*/
        
        setTitle("AWT Example");
        setSize(20, 100);
        setVisible(true);
        aw.addWindowListener(new Myclass());
    }
    class Myclass implements windowListener{
        public void windowActivated(windowEvent e){}

    }

    public static void main(String[] args) {
        AWTExample aw=new AWTExample();
        new AWTExample();
    }
}
