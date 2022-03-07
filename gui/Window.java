package gui;

import javax.swing.*;
import java.awt.*;

public class Window {
    public Window() {
        //1. Create the frame.
        JFrame frame = new JFrame("Tic-tac-toe");

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        JLabel emptyLabel = new JLabel("");
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //4. Size the frame.
        frame.setSize(250, 250);

        //5. Show it.
        frame.setVisible(true);
    }

}
