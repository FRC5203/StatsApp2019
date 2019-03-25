package desktop;

import javax.swing.*;
import java.awt.*;

public class Window {

    public JFrame frame;
    public JPanel content;

    public Window(String name){
        frame = new JFrame(name);
        frame.setMinimumSize(new Dimension(500,500));
        frame.setMaximumSize(new Dimension(500,500));
        frame.setPreferredSize(new Dimension(500,500));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Center the window
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        //Set content
        content = new JPanel();
        frame.add(content);
        content.setBounds(frame.getBounds());

        //Make it appear
        frame.setVisible(true);
    }

}
