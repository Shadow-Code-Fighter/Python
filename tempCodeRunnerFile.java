import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame {

    public AWTExample() {
        setLayout(new FlowLayout());
        
        Label label = new Label("Click the button:");
        add(label);
        
        Button button = new Button("Click Me");
        add(button);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });
        
        setTitle("AWT Example");
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
